package com.muying.smartmine.user.relation.biz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@MapperScan("com.muying.smartmine.user.relation.biz.domain.mapper")
@EnableFeignClients(basePackages = "com.muying.smartmine")
public class SmartmineUserRelationBizApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmartmineUserRelationBizApplication.class, args);
    }

}