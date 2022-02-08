package com.gnewsoft.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {
	private static final String TOPIC = "exam";
	private final KafkaTemplate<String, String> kafkaTemlplate;
	
	@Autowired
	public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
		this.kafkaTemlplate = kafkaTemplate;
	}
	
	public void sendMessage(String message) {
		System.out.printf("Producer message : %s\n", message);
		this.kafkaTemlplate.send(TOPIC, message);
	}
	
}
