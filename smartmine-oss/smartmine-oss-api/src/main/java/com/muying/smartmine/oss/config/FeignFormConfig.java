package com.muying.smartmine.oss.config;

import feign.codec.Encoder;
import feign.form.spring.SpringFormEncoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description: SpringFormEncoder 是 Feign 提供的一个编码器，用于处理表单提交。
 * 它将对象编码为表单数据格式（如 application/x-www-form-urlencoded 或 multipart/form-data）
 * ，以便在 HTTP 请求中使用。
 **/
@Configuration
public class FeignFormConfig {

    @Bean
    public Encoder feignFormEncoder() {
        return new SpringFormEncoder();
    }
}