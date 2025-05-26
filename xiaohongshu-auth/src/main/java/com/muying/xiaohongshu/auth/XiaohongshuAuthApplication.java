package com.muying.xiaohongshu.auth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.muying.xiaohongshu.auth.domain.mapper")
public class XiaohongshuAuthApplication {

    public static void main(String[] args) {
        System.out.printf(System.getProperty("file.encoding"));
        SpringApplication.run(XiaohongshuAuthApplication.class, args);
    }

}
