package com.consulta.cep.kafka.service;

import com.consulta.cep.kafka.MessageProducer;

public class MessagingService {
    private final MessageProducer producer;

    public MessagingService(MessageProducer producer) {
        this.producer = producer;
    }

    public void send(String topic, String key, String value) {
        producer.sendMessage(topic, key, value);
    }
}