package com.java.myspringbootdemo02;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.java.myspringbootdemo02.Persistence")
public class MySpringbootDemo02Application {

    public static void main(String[] args) {
        SpringApplication.run(MySpringbootDemo02Application.class, args);
        System.out.println("启动成功");
    }
}
