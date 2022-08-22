package com.rabbitmq.consumer.domain.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "MESSAGES")
@Setter
@Getter
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "message", nullable = true)
    private String message;

    public Message(String message) {
        this.message=message;
    }
}
