package com.antrou.demo;

import com.antrou.service.Listener;
import com.antrou.service.TestService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by yc on 2014/11/28.
 */
public class TestClient {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"consumer.xml"});
        context.start();

        TestService demoService = (TestService)context.getBean("demoService"); // 获取远程服务代理
        String hello = demoService.say("world"); // 执行远程方法

        System.out.println("say : " + hello);
        demoService.addListener(new Listener() {
            @Override
            public void onChange(String state) {
                System.out.println(state);
            }
        });
    }
}
