package com.revature.msa.services;

import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.model.Message;
import com.amazonaws.services.sqs.model.ReceiveMessageRequest;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.msa.dtos.UserDeletedMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class QueueService {

    @Value("${mq.url}")
    private String queueUrl;

    private AmazonSQS sqsClient;
    private ObjectMapper mapper;
    private FlashcardService cardService;

    @Autowired
    public QueueService(AmazonSQS sqs, ObjectMapper mapper, FlashcardService service) {
        this.sqsClient = sqs;
        this.mapper = mapper;
        this.cardService = service;
    }

    @Scheduled(initialDelay=1000, fixedRate=10000)
    public void pollForMessages() {

        ReceiveMessageRequest msgReq = new ReceiveMessageRequest(queueUrl);
        msgReq.setVisibilityTimeout(0);

        List<Message> msgs = sqsClient.receiveMessage(msgReq).getMessages();

        if (!msgs.isEmpty()) {
            System.out.println("Messages recieved!");
            msgs.forEach(this::parseMessage);
        } else {
            System.out.println("No messages found.");
        }

    }

    public void parseMessage(Message msg) {

        try {

            System.out.println(msg.getBody());

            UserDeletedMessage queueMsg = mapper.readValue(msg.getBody(), UserDeletedMessage.class);

            System.out.println(queueMsg);

            if (queueMsg.getOperation().equals("delete") && queueMsg.getInitiator().equals("user-service")) {
                cardService.deleteCardByCreatorId(queueMsg.getResourceId());
                sqsClient.deleteMessage(queueUrl, msg.getReceiptHandle());
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
