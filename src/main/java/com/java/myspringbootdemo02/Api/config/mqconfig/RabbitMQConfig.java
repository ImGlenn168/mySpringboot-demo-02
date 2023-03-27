package com.java.myspringbootdemo02.Api.config.mqconfig;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class RabbitMQConfig {

    // 交换机
    public final static String fanoutExchange="fanout_work_exchange";

    // 创建交换机

    @Bean
    public Queue queue(){
        return new Queue("simpleQueue");
    }
}
