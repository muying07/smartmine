package com.muying.xiaohongshu.comment.biz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.retry.annotation.EnableRetry;

@SpringBootApplication
@MapperScan("com.muying.xiaohongshu.comment.biz.domain.mapper")
@EnableFeignClients
@EnableRetry // 启用 Spring Retry
public class XiaohongshuCommentBizApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiaohongshuCommentBizApplication.class, args);
    }

}