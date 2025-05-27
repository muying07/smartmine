package com.muying.xiaohongshu.oss.biz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.muying.xiaohongshu.oss")
@SpringBootApplication
public class XiaohongshuOssBizApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(XiaohongshuOssBizApplication.class, args);
    }
}
