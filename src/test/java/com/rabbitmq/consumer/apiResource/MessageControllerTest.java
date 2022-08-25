package com.rabbitmq.consumer.apiResource;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MessageControllerTest {

    private HomeController homeController = new HomeController();

    @Test
    void message() {
        assertEquals(200, homeController.consumer().getStatusCode());
    }
}