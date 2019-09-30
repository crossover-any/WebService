package com.txq;

import com.txq.service.impl.HelloServiceImpl;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

/**
 * @Author Tengxq
 * @Date 2019/9/29 16:13
 * @Describle
 * @Version 1.0
 */
public class Server {
    public static void main(String[] args) {
        JaxWsServerFactoryBean factoryBean = new JaxWsServerFactoryBean();

        factoryBean.setAddress("http://localhost:8000/ws/hello");

        factoryBean.setServiceBean(new HelloServiceImpl());

        //
        factoryBean.getInInterceptors().add(new LoggingInInterceptor());
        factoryBean.getOutInterceptors().add(new LoggingOutInterceptor());
        factoryBean.create();
        System.out.println("发布服务成功！端口8000");
    }
}
