package com.rabbitmq.consumer.events;

import com.rabbitmq.consumer.domain.entity.Message;
import com.rabbitmq.consumer.domain.repository.MessageRepository;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class RabbitmqMessageListener {

    private MessageRepository messageRepository;

    public RabbitmqMessageListener(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @RabbitListener(queues = "MESSAGE-QUEUE")
    void listen(String message) {
        Message msg = new Message(message);
        messageRepository.save(msg);
    }
}
