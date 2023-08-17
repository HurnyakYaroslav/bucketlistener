package com.bucketlistener.configuration;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.gcp.pubsub.core.PubSubTemplate;
import org.springframework.cloud.gcp.pubsub.integration.AckMode;
import org.springframework.cloud.gcp.pubsub.integration.inbound.PubSubInboundChannelAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHandler;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.bucketlistener.dto.StorageObject;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class ListenerConfiguration {

    @Value("${gcp.topic.subscription.name}")
    private String subscriptionName;

    @Bean
    public MessageChannel pubsubInputChannel() {
        return new DirectChannel();
    }

    @Bean
    public PubSubInboundChannelAdapter messageChannelAdapter(
            @Qualifier("pubsubInputChannel") MessageChannel inputChannel,
            PubSubTemplate pubSubTemplate) {
        PubSubInboundChannelAdapter adapter =
                new PubSubInboundChannelAdapter(pubSubTemplate, subscriptionName);
        adapter.setOutputChannel(inputChannel);
        adapter.setAckMode(AckMode.MANUAL);

        return adapter;
    }

//    @Bean
//    @ServiceActivator(inputChannel = "pubsubInputChannel")
    public MessageHandler messageReceiver() {
        return message -> {
            StorageObject storageObject;
            try {
                storageObject = new ObjectMapper().readValue((byte[]) message.getPayload(), StorageObject.class);
            } catch (IOException e) {
                log.warn(e.getMessage());
                throw new RuntimeException(e);
            }
            log.info("Message arrived to message receiver bean! Name of storage object: " + storageObject.getName());
        };
    }
}
