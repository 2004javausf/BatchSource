package com.revature.msa.services;

import com.amazonaws.services.sns.AmazonSNS;
import com.amazonaws.services.sns.model.PublishRequest;
import com.amazonaws.services.sns.model.PublishResult;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.msa.dtos.UserDeletedMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class QueueService {

    @Value("${mq.topic_arn}")
    private String topicArn;

    private AmazonSNS snsClient;
    private ObjectMapper mapper;

    @Autowired
    public QueueService(AmazonSNS sns, ObjectMapper mapper) {
        this.snsClient = sns;
        this.mapper = mapper;
    }

    public void publishUserDeletedMessage(int userId) {

        try {

            UserDeletedMessage msg = new UserDeletedMessage()
                                            .setOperation("delete")
                                            .setInitiator("user-service")
                                            .setResourceId(userId);

            String msgJSON = mapper.writeValueAsString(msg);

            PublishResult pubResult = snsClient.publish(new PublishRequest(topicArn, msgJSON));
            System.out.println("Message with id, " + pubResult.getMessageId() +  ", was successfully published to the queue.");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
