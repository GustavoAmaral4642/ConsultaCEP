package com.maquina.logs.MaquinaLogs.repository;

import com.maquina.logs.MaquinaLogs.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
