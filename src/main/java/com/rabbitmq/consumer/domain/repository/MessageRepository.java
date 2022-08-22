package com.rabbitmq.consumer.domain.repository;

import com.rabbitmq.consumer.domain.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
