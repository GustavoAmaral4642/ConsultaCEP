package com.maquina.logs.MaquinaLogs.kafka;

public interface MessageConsumer  {
    void consume(String message);
}