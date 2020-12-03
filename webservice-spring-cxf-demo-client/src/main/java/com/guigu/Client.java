package com.guigu;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

/**
 * Created by Administrator on 2017/4/11.
 */
public class Client {
    public static void main(String[] args){
        JaxWsProxyFactoryBean jaxWsProxyFactoryBean=new JaxWsProxyFactoryBean();
        jaxWsProxyFactoryBean.setAddress("http://localhost:8080/mumu_demo_cxf_server_war/service/HelloWorldService");
        jaxWsProxyFactoryBean.setServiceClass(HelloWorldService.class);
        HelloWorldService helloWorldService = (HelloWorldService)jaxWsProxyFactoryBean.create();
        System.out.println(helloWorldService.sayHello());
    }
}
