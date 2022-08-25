package com.rabbitmq.consumer.apiResource;

import com.rabbitmq.consumer.domain.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class HomeController {

    @Autowired(required = true)
    private MessageRepository messageRepository;

    @RequestMapping(value = "/consumer", method = RequestMethod.GET)
    public ResponseEntity<Integer> consumer() {
        Integer messageCount = Math.toIntExact(messageRepository.count());
        return new ResponseEntity<Integer>(messageCount, HttpStatus.OK);
    }
}
