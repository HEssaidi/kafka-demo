package com.example.kafkademoproducer.config;


import com.example.kafkademoproducer.model.Agency;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class KafkaSerialization {

    @Bean
    public ProducerFactory<String, Agency> producerFactory(){
        Map<String, Object> config = new HashMap<>();

        config.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        config.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);   //KEY_SERIALIZER is a string
        config.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);   //VALUE_SERIALIZER is a JSON object

        return new DefaultKafkaProducerFactory<>(config);
    }



    @Bean
    public KafkaTemplate<String, Agency> kafkaTemplate(){
        return new KafkaTemplate<>(producerFactory());
    }
}
