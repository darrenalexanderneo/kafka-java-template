package org.spring.kafka.java.sandbox;

import org.apache.kafka.common.protocol.Message;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.test.context.EmbeddedKafka;
import org.springframework.test.annotation.DirtiesContext;

@SpringBootTest
@DirtiesContext
@EmbeddedKafka(brokerProperties = {"listeners=PLAINTEXT://localhost:9092", "port=9092"})
class SandboxApplicationTests {

	@Autowired
	private KafkaConsumer consumer;

	@Autowired
	private KafkaProducer producer;

//	@Value("${test.topic}")
	private String topic = "testing-topic-1";

	@Test
	public void embeddedKafkaTest() throws Exception {
		Thread.sleep(100000L);
		MessageRequest data = new MessageRequest("Testing message");
		producer.send(topic, data);

		Assertions.assertThat(data).isNotNull();
	}

}
