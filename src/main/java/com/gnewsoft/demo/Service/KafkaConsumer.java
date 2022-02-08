package com.gnewsoft.demo.Service;

import java.io.IOException;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

	@KafkaListener(topics = "exam", groupId = "foo")
	public void consumeFoo(String message) throws IOException{
		System.out.printf("Consumed message from foo : %s\n", message);
	}
	
//	@KafkaListener(topics = "exam", groupId = "baa")
//	public void consumeBaa(String message) throws IOException{
//		System.out.printf("Consumed message from baa : %s\n", message);
//	}
	
}
