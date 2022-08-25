package com.rabbitmq.consumer.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitmqListeners {
    @RabbitListener(queues = "MESSAGE-QUEUE")
    public void consumer(String message) {
        System.out.print("Mesage from rabbitMQ: "+message);
    }

}
