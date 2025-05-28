package com.muying.xiaohongshu.user.relation.biz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@MapperScan("com.muying.xiaohongshu.user.relation.biz.domain.mapper")
@EnableFeignClients(basePackages = "com.muying.xiaohongshu")
public class XiaohongshuUserRelationBizApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiaohongshuUserRelationBizApplication.class, args);
    }

}