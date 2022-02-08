package com.gnewsoft.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.gnewsoft.demo.Service.KafkaProducer;

@SpringBootTest
public class KafkaControlerTest {
	@Autowired
	KafkaProducer producer;
	
	@Test
	public void loop() {
		int cnt = 1;
		while(cnt < 11) {
			producer.sendMessage(String.format("message no - %d", cnt++));
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				System.out.println("error");
			}
		}
		producer.sendMessage("test finish~!");
	}
}
