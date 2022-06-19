package org.spring.kafka.java.sandbox;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaProducer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaProducer.class);

    @Autowired
    private KafkaTemplate<Object, MessageRequest> kafkaTemplate;

    public void send(Object topic, MessageRequest payload) {
        LOGGER.info("Sending payload....: " + payload );
        kafkaTemplate.send((String)topic, payload);
    }
}
