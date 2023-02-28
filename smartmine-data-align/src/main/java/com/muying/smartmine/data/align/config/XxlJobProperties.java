package com.muying.smartmine.data.align.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @description: xxl-job 配置读取
 **/
@ConfigurationProperties(prefix = XxlJobProperties.PREFIX)
@Component
@Data
public class XxlJobProperties {

    public static final String PREFIX = "xxl.job";

    private String adminAddresses;

    private String accessToken;

    private String appName;

    private String ip;

    private int port;

    private String logPath;

    private int logRetentionDays = 30;
}
