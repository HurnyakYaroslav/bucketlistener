package com.bucketlistener.controller;

import java.io.IOException;

import org.springframework.cloud.gcp.pubsub.support.BasicAcknowledgeablePubsubMessage;
import org.springframework.cloud.gcp.pubsub.support.GcpPubSubHeaders;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.Header;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.bucketlistener.dto.StorageObject;

import lombok.extern.slf4j.Slf4j;


@MessageEndpoint
@Slf4j
class PubSubMessageReceiver {

//    @ServiceActivator(inputChannel = "pubsubInputChannel")
    public void receiveMessage(
            Message<String> message,
            @Header(GcpPubSubHeaders.ORIGINAL_MESSAGE) BasicAcknowledgeablePubsubMessage pubsubMessage) {
        StorageObject storageObject;
        try {
            storageObject = new ObjectMapper().readValue(message.getPayload(), StorageObject.class);
        } catch (IOException e) {
            log.warn(e.getMessage());
            throw new RuntimeException(e);
        }
        log.info("Message arrived to message endpoint! Storage object name: " + storageObject.getName());
//        pubsubMessage.ack();
    }
}
