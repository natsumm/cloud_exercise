package com.bjming.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationContextConfig {

    //注意bean的名称, 默认是方法名
    @Bean(name = "restTemplate")
    @LoadBalanced //使用注解@LoadBalanced赋予RestTemplate负载均衡的能力, 默认是轮询
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
