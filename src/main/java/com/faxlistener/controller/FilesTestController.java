package com.faxlistener.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//import org.springframework.cloud.gcp.pubsub.support.BasicAcknowledgeablePubsubMessage;
//import org.springframework.cloud.gcp.pubsub.support.GcpPubSubHeaders;
//import org.springframework.integration.annotation.MessageEndpoint;
//import org.springframework.integration.annotation.ServiceActivator;
//import org.springframework.messaging.Message;
//import org.springframework.messaging.handler.annotation.Header;


//@RestController("/files")
public class FilesTestController {

//    private PubSubMessageReceiver pubSubMessageReceiver;

//    @GetMapping
//    public String getWord(){
////        pubSubMessageReceiver.receiveMessage();
//        return "Get Word";
//    }


}

//@MessageEndpoint
//class PubSubMessageReceiver {
//
//    @ServiceActivator(inputChannel = "pubsubInputChannel")
//    public void receiveMessage(
//            Message<String> message,
//            @Header(GcpPubSubHeaders.ORIGINAL_MESSAGE) BasicAcknowledgeablePubsubMessage pubsubMessage) {
//        String payload = message.getPayload();
//        // Process the message payload
//        System.out.println("Received message: " + payload);
//        pubsubMessage.ack();
//    }
//}
