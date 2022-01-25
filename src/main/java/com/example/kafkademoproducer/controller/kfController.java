package com.example.kafkademoproducer.controller;

import com.example.kafkademoproducer.model.Agency;
import com.example.kafkademoproducer.service.TopicProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/kafka")
public class kfController {

    private final TopicProducer topicProducer;
    @PostMapping(value = "/send")
    public void send(@RequestBody Agency agency){
        topicProducer.send(agency);
    }

}
