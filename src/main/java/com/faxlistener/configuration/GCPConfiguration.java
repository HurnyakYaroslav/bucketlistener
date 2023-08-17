package com.faxlistener.configuration;
//
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.cloud.gcp.pubsub.core.PubSubTemplate;
//import org.springframework.cloud.gcp.pubsub.integration.AckMode;
//import org.springframework.cloud.gcp.pubsub.integration.inbound.PubSubInboundChannelAdapter;
//import org.springframework.cloud.gcp.pubsub.integration.outbound.PubSubMessageHandler;
//import org.springframework.cloud.gcp.pubsub.support.BasicAcknowledgeablePubsubMessage;
//import org.springframework.cloud.gcp.pubsub.support.GcpPubSubHeaders;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.integration.annotation.MessagingGateway;
//import org.springframework.integration.annotation.ServiceActivator;
//import org.springframework.integration.channel.DirectChannel;
//import org.springframework.messaging.MessageChannel;
//import org.springframework.messaging.MessageHandler;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.gcp.pubsub.core.PubSubTemplate;
import org.springframework.cloud.gcp.pubsub.integration.AckMode;
import org.springframework.cloud.gcp.pubsub.integration.inbound.PubSubInboundChannelAdapter;
import org.springframework.cloud.gcp.pubsub.support.BasicAcknowledgeablePubsubMessage;
import org.springframework.cloud.gcp.pubsub.support.GcpPubSubHeaders;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHandler;

//@Configuration
//@Slf4j
public class GCPConfiguration {


//    @Bean
//    @ServiceActivator(inputChannel = "pubsubInputChannel")
//    public MessageHandler messageReceiver() {
//        return message -> {
////            LOGGER.info("Message arrived! Payload: " + new String((byte[]) message.getPayload()));
//            BasicAcknowledgeablePubsubMessage originalMessage =
//                    message.getHeaders().get(GcpPubSubHeaders.ORIGINAL_MESSAGE, BasicAcknowledgeablePubsubMessage.class);
//            originalMessage.ack();
//        };
//    }
//
//    @Bean
//    public MessageChannel pubsubInputChannel() {
//        return new DirectChannel();
//    }
//
//    @Bean
//    public PubSubInboundChannelAdapter messageChannelAdapter(
//            @Qualifier("pubsubInputChannel") MessageChannel inputChannel,
//            PubSubTemplate pubSubTemplate) {
//        PubSubInboundChannelAdapter adapter =
//                new PubSubInboundChannelAdapter(pubSubTemplate, "projects/plenary-treat-396208/subscriptions/subs1");
//        adapter.setOutputChannel(inputChannel);
//        adapter.setAckMode(AckMode.MANUAL);
//
//        return adapter;
//    }

}