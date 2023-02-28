package com.muying.smartmine.user.biz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.muying.smartmine.user.biz.domain.mapper")
@EnableFeignClients(basePackages = "com.muying.smartmine")
@ComponentScan({"com.muying.smartmine.user.biz", "com.muying.smartmine.count"}) //  多模块扫描
public class SmartmineUserBizApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(SmartmineUserBizApplication.class, args);
    }
}
