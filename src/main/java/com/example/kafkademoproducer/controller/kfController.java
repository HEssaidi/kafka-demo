package com.example.kafkademoproducer.controller;

import com.example.kafkademoproducer.service.TopicProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/kafka")
public class kfController {

    private final TopicProducer topicProducer;
    @GetMapping(value = "/send")
    public void send(){
        topicProducer.send("Producing messages to test our Kafka ecosystem");
    }

}
