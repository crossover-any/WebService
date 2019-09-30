package com.webservice.impl;

import com.webservice.HelloService;

/**
 * @Author Tengxq
 * @Date 2019/9/29 16:11
 * @Describle
 * @Version 1.0
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return name+",Welcome to WebService";
    }
}
