package com.java.myspringbootdemo02.App.service.rabbitmq.impl;

import com.java.myspringbootdemo02.App.service.rabbitmq.RabbitMqService;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@RabbitListener(queues = {"simpleQueue"})
public class RabbitMqServiceImpl implements RabbitMqService {

    @RabbitHandler
    public void getMessage(String message){
        System.out.println(message);
    }
}
