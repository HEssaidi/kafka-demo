package com.example.kafkademoproducer.model;


import lombok.Data;

@Data
public class Agency {
    private Long id;
    private String agency_ref;
    private String name;
    private String address;
}
