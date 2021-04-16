package com.paojiao.cloud.nacosprovider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description
 * @author tanyue
 * @Date 2021/4/13
 **/
@RestController
@RequestMapping(value = "/provider")
public class ProviderController
{
    @GetMapping(value = "/test")
    public String display(String name){
        return "providr" + name;
    }
}
