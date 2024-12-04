package com.consulta.cep.service.impl;

import com.consulta.cep.kafka.MessageProducer;
import com.consulta.cep.kafka.impl.KafkaMessageProducer;
import com.consulta.cep.kafka.service.MessagingService;

public class SentMessageKafka {

    public static void sent(String message){
        MessageProducer producer = new KafkaMessageProducer("localhost:9092");
        MessagingService service = new MessagingService(producer);

        service.send("my-topic", "key", message);

        ((KafkaMessageProducer) producer).close();
    }
}
