package com.muying.smartmine.note.biz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@MapperScan("com.muying.smartmine.note.biz.domain.mapper")
@EnableFeignClients(basePackages = "com.muying.smartmine")
public class SmartmineNoteBizApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmartmineNoteBizApplication.class, args);
    }

}
