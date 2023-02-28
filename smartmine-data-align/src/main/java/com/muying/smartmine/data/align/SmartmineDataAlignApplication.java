package com.muying.smartmine.data.align;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@MapperScan("com.muying.smartmine.data.align.domain.mapper")
@EnableFeignClients(basePackages = "com.muying.smartmine")
public class SmartmineDataAlignApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmartmineDataAlignApplication.class, args);
    }

}