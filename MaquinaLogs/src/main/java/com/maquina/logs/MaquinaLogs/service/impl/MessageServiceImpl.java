package com.maquina.logs.MaquinaLogs.service.impl;

import com.maquina.logs.MaquinaLogs.domain.Message;
import com.maquina.logs.MaquinaLogs.repository.MessageRepository;
import com.maquina.logs.MaquinaLogs.service.MessageService;
import org.apache.tomcat.jni.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class MessageServiceImpl implements MessageService {

    private final MessageRepository messageRepository;

    @Autowired
    public MessageServiceImpl(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @Override
    public void processMessage(String message) {
        try {
            Message msg = new Message();
            msg.setRegister("Registro de pesquisa de endereço realizado com sucesso");
            msg.setTime(LocalDateTime.now().toString());
            msg.setContent(message);
            messageRepository.save(msg);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}