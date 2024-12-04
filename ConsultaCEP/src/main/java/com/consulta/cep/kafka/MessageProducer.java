package com.consulta.cep.kafka;

public interface MessageProducer {
    void sendMessage(String topic, String key, String value);
}
