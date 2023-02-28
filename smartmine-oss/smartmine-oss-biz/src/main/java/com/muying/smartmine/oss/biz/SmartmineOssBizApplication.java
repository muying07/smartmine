package com.muying.smartmine.oss.biz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.muying.smartmine.oss")
@SpringBootApplication
public class SmartmineOssBizApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(SmartmineOssBizApplication.class, args);
    }
}
