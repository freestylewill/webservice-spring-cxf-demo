package com.guigu;

import com.lovecws.mumu.demo.cxf.service.HelloWorldService;
import com.lovecws.mumu.demo.cxf.service.WeatherService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/4/11.
 */
public class Main {
    public static void main(String[] args){
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:spring-cxf-client.xml");
        applicationContext.start();

        HelloWorldService helloWorldService = applicationContext.getBean(HelloWorldService.class);
        String sayHello = helloWorldService.sayHello();
        System.err.println(sayHello);

        WeatherService weatherService = applicationContext.getBean(WeatherService.class);
        String[] databaseInfo = weatherService.getDatabaseInfo();
        System.err.println(databaseInfo[0]);
    }
}
