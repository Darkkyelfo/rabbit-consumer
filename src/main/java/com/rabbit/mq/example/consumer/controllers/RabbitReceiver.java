package com.rabbit.mq.example.consumer.controllers;


import com.rabbit.mq.example.consumer.model.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

import org.springframework.stereotype.Component;

@Component
@Slf4j
public class RabbitReceiver {

    @RabbitListener(queues = "${rabbitmq.queue}")
    public void receiveFromRabbit(Message message) {
        log.info("queues <{}>", message);
    }
}
