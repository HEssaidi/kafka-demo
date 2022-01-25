package com.example.kafkademoproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class KafkaDemoProducerApplication {
	public static void main(String[] args) {
		SpringApplication.run(KafkaDemoProducerApplication.class, args);
	}

}
