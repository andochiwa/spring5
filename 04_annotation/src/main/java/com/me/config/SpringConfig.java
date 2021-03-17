package com.me.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// Configuration表示标志此类为配置类，代替xml配置文件
@Configuration
@ComponentScan(basePackages = {"com.me"})
public class SpringConfig {

}
