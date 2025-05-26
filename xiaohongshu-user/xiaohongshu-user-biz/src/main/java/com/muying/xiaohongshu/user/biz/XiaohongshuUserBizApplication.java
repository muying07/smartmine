package com.muying.xiaohongshu.user.biz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.muying.xiaohongshu.user.biz.domain.mapper")
public class XiaohongshuUserBizApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(XiaohongshuUserBizApplication.class, args);
    }
}
