package com.paojiao.cloud.nacos.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @description
 * @author tanyue
 * @Date 2021/4/13
 **/
@Component
@ConfigurationProperties(prefix = "simple")
public class SimpleProperty
{
    /**
     * 姓名
     */
    private String name;

    /**
     * 电话
     */
    private String mobile;

    public String getName()
    {
        return name;
    }
    public String getMobile()
    {
        return mobile;
    }

    public SimpleProperty setName(String name){
        this.name = name;
        return this;
    }

    public SimpleProperty setMobile(String mobile){
        this.mobile = mobile;
        return this;
    }
}
