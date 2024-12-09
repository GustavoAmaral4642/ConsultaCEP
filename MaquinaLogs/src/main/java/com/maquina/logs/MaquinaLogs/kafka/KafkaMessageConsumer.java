package com.maquina.logs.MaquinaLogs.kafka;

import com.maquina.logs.MaquinaLogs.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageConsumer implements MessageConsumer {

    private final MessageService messageService;

    @Autowired
    public KafkaMessageConsumer(MessageService messageService) {
        this.messageService = messageService;
    }

    @KafkaListener(topics = "my-topic", groupId = "my-group")
    @Override
    public void consume(String message) {
        try{
            messageService.processMessage(message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}