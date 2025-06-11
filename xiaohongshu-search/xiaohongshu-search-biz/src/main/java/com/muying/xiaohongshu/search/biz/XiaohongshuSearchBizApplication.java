package com.muying.xiaohongshu.search.biz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.muying.xiaohongshu.search.biz.domain.mapper")
@EnableScheduling
public class XiaohongshuSearchBizApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiaohongshuSearchBizApplication.class, args);
    }

}