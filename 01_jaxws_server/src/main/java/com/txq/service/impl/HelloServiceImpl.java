package com.txq.service.impl;

import com.txq.service.HelloService;

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
