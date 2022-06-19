package org.spring.kafka.java.sandbox;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {
//
//    @KafkaListener(topics = "amigoscode", groupId = "groupIdFoo")
//    void listener(String data) {
//        System.out.println("Listener receive data: " + data);
//    }

    @KafkaListener(topics = "darren-topic-new", groupId = "groupIdFooNo2")
    void listener2(@Payload MessageRequest data) {
        System.out.println("Listener receive data: " + data);
    }
}
