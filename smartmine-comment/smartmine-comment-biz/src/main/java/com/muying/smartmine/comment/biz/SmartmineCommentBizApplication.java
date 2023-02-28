package com.muying.smartmine.comment.biz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.retry.annotation.EnableRetry;

@SpringBootApplication
@MapperScan("com.muying.smartmine.comment.biz.domain.mapper")
@EnableFeignClients
@EnableRetry // 启用 Spring Retry
public class SmartmineCommentBizApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmartmineCommentBizApplication.class, args);
    }

}