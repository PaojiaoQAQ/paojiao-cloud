package com.paojiao.cloud.nacos.controller;

import com.alibaba.fastjson.JSONObject;
import com.paojiao.cloud.nacos.config.SimpleProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @description
 * @author tanyue
 * @Date 2021/4/13
 **/
@RestController
@RequestMapping(value = "simple")
public class SimpleController
{
    @Autowired
    private SimpleProperty simpleProperty;

    @GetMapping(value = "/test0")
    public SimpleProperty getSimpleProperty(){
        return simpleProperty;
    }

    @Value(value = "${simple.name}")
    private String name;
    @Value(value = "${simple.mobile}")
    private String mobile;

    @GetMapping(value = "test1")
    public Map<String,Object> test1(){
        return new JSONObject().fluentPut("name",name).fluentPut("mobile",mobile);
    }
}
