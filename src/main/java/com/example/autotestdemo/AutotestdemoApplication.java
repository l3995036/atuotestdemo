package com.example.autotestdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@MapperScan("com.example.autotestdemo.dao")
@SpringBootApplication(exclude = MongoAutoConfiguration.class)
public class AutotestdemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(AutotestdemoApplication.class, args);
    }

}
