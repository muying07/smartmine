package com.muying.xiaohongshu.auth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.muying.xiaohongshu")
public class XiaohongshuAuthApplication {

    public static void main(String[] args) {
        System.out.printf(System.getProperty("file.encoding"));
        SpringApplication.run(XiaohongshuAuthApplication.class, args);
    }

}
