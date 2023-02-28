package com.muying.smartmine.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableFeignClients(basePackages = "com.muying.smartmine")
public class SmartmineAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmartmineAuthApplication.class, args);
    }

}
