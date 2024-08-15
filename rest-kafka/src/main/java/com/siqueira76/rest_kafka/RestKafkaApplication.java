package com.siqueira76.rest_kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class RestKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestKafkaApplication.class, args);
	}

}
