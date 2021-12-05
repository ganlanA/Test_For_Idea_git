package com.kuang.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//Ribbon和Eureka整合后，客户端直接调用,不用担心ip地址和端口号
@SpringBootApplication
@EnableEurekaClient
public class DeptConsumer_6001 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_6001.class, args);
    }
}

//p11
//6:40
