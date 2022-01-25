package com.example.kafkademoproducer.service;

import com.example.kafkademoproducer.model.Agency;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class TopicProducer {

    @Value("${topic.name.producer}")
    private String topicName;


    private final KafkaTemplate<String, Agency> kafkaTemplate;

    public void send(Agency agency){
        log.info("Payload enviado: {}",agency);
        kafkaTemplate.send(topicName, agency);
    }
}
