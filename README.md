# Springboot RabbitMQ Consumer

Demo project for springboot message consumer using [rabbitMQ](https://www.rabbitmq.com/).

## RabbitMQ

RabbitMQ is one of the most popular open source message brokers.

![rabbitMQ consumer service](https://github.com/arsibux/springboot-rabbitMQ-consumer/blob/main/draw_io/rabbitmq-consumer.drawio.png "rabbitMQ consumer service")

## Installation

1. Run command at code directory `git clone https://github.com/arsibux/springboot-rabbitMQ-consumer.git`
2. Run `docker-compose up -d` [docker-desktop installation](https://docs.docker.com/desktop/)
3. Open Project in [IntelliJ Idea](https://www.jetbrains.com/idea/download/).
4. Run `mvn clean install` and run `mvn spring-boot:run`
5. Import workspace file of [Postman](https://www.postman.com/downloads/)
   at `${root}/postman/RabbitMQ.postman_collection` into postman.

![postman-api-call](https://github.com/arsibux/springboot-rabbitMQ-consumer/blob/main/docs/img/postman-api-call.png "postman-api-call")

You can see the message here at terminal.

![terminal](https://github.com/arsibux/springboot-rabbitMQ-consumer/blob/main/docs/img/terminal.png "terminal")

## Resources

* [Spring AMQP](https://spring.io/projects/spring-amqp#overview)
* [Messaging with Spring AMQP](https://www.baeldung.com/spring-amqp)