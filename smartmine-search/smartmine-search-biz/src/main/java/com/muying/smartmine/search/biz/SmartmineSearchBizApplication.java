package com.muying.smartmine.search.biz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.muying.smartmine.search.biz.domain.mapper")
@EnableScheduling
public class SmartmineSearchBizApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmartmineSearchBizApplication.class, args);
    }

}