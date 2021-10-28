package com.lrn.mine;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@MapperScan(basePackages = "com.lrn.mine.mapper")
public class run {
    public static void main(String[] args) {
        SpringApplication.run(run.class,args);
    }
}

