package com.olla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.olla")
public class OllamaApplication {
	public static void main(String[] args) {
		SpringApplication.run(OllamaApplication.class, args);
	}

}
