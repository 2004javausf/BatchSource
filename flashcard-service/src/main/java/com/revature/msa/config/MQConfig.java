package com.revature.msa.config;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.AmazonSQSClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:env.properties")
public class MQConfig {

    @Value("${mq.region}")
    private String awsRegion;

    @Value("${mq.access_key}")
    private String accessKey;

    @Value("${mq.secret_access_key}")
    private String secretAccessKey;

    @Bean
    public AWSStaticCredentialsProvider credentialsProvider() {
        return new AWSStaticCredentialsProvider(new BasicAWSCredentials(accessKey, secretAccessKey));
    }

    @Bean
    public AmazonSQS sqsClient() {
        return AmazonSQSClient.builder()
                            .withCredentials(credentialsProvider())
                            .withRegion(awsRegion)
                            .build();
    }

}
