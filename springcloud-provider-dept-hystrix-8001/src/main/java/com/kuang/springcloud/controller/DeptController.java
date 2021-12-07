package com.kuang.springcloud.controller;


import com.kuang.springcloud.pojo.Dept;
import com.kuang.springcloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


//提供restful服务
@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;

    //
    @GetMapping("/dept/get/{id}")
    @HystrixCommand(fallbackMethod = "Hystrix_get")
    public Dept get(@PathVariable("id") Long id){
        Dept dept = deptService.queryById(id);
        if(dept == null){
            throw new RuntimeException("id =>" + id + "不存在该用户");
        }
        return dept;
    }


    public Dept Hystrix_get(@PathVariable("id") Long id){
        return new Dept().setDeptno(id).setDname("id =>" + id + "不存在该用户null--by Hystrix")
                .setDb_source("no this database in Mysql");
    }



}

//p5
