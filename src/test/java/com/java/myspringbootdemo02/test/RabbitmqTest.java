package com.java.myspringbootdemo02.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class RabbitmqTest {

    @Resource
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private Queue queue;

    @Test
    public void contextLoads(){
        String message="Hello Simple RabbitMQ";
        rabbitTemplate.convertAndSend(queue.getName(),message);
    }
}
