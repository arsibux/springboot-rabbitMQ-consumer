package com.rabbitmq.consumer.domain.entity;

import javax.persistence.*;

@Entity
@Table(name = "MESSAGES")
public class Message {
    @Id
    @SequenceGenerator(name = "message_sequence", sequenceName = "message_sequence", allocationSize = 1)
    @GeneratedValue(generator = "message_sequence")
    private Long id;
    private String message;

    public Message() {
    }

    public Message(String message) {
        this.message = message;
    }

    public Message(Long id, String message) {
        this.id = id;
        this.message = message;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
