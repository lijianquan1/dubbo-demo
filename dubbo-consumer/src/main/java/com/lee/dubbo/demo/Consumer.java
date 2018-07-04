package com.lee.dubbo.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author:ljq
 * Date: 2018/5/30
 **/
public class Consumer {
    public static void main(String[] args) {
        //测试常规服务
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        System.out.println("consumer start");
        DemoService demoService = context.getBean(DemoService.class);
        System.out.println("consumer");
        System.out.println(demoService.getPermissions(1L));
    }
}