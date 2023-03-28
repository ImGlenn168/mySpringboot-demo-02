package com.java.myspringbootdemo02.App.service.rabbitmq.routingmodel;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@RabbitListener(queues = "routingQueue2")
public class RoutingModelC2 {
    @RabbitHandler
    public void c1(String message){
        System.out.println("C2: "+message);
    }
}
