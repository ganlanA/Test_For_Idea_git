package com.kuang.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

//Ribbon和Eureka整合后，客户端直接调用,不用担心ip地址和端口号
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.kuang.springcloud"})
public class FeignDeptConsumer_6001 {
    public static void main(String[] args) {
        SpringApplication.run(FeignDeptConsumer_6001.class, args);
    }
}

//p14
//3:52
