package com.kuang.springcloud.config;


import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {


    //负载均衡算法：
    //AvailabilityFilteringRule 过滤掉故障的服务,对剩下的轮询
    //RoundRobinRule 轮询
    //RandomRule 随机算法
    @Bean
    @LoadBalanced //riibbon
    public RestTemplate getrestTemplate(){
        return new RestTemplate();
    }


}
