package org.spring.kafka.java.sandbox;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/messages")
public class MessageController {


   @Autowired
    private KafkaTemplate<Object, MessageRequest> kafkaTemplate;


    @PostMapping
    public MessageRequest publish(@RequestBody MessageRequest request) {
        System.out.println("Printing a message from Kafka Publish Controller!");
        kafkaTemplate.send("darren-topic", request);
        return request;
    }
}
