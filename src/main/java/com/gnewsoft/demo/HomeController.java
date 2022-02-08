package com.gnewsoft.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@GetMapping("/")
	public static String main(String[] args) {
		return new SimpleDateFormat("현재시간 : yyyy-MM-dd HH:mm:ss").format(new Date());
	}
}
