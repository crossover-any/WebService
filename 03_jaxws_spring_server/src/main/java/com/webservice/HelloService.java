package com.webservice;

import javax.jws.WebService;

/**
 * @Author Tengxq
 * @Date 2019/9/29 16:03
 * @Describle 对外发布服务的接口
 * @Version 1.0
 */
@WebService
public interface HelloService {
    /**
     * 对外发布服务的接口的方法
     */
    public String sayHello(String name);
}
