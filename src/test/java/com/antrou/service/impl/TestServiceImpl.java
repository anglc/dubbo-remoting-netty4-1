package com.antrou.service.impl;

import com.antrou.service.Listener;
import com.antrou.service.TestService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yc on 2014/11/28.
 */
@Service
public class TestServiceImpl implements TestService {

    private final List<Listener> list = new ArrayList<Listener>();

    public TestServiceImpl(){
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true) {
                    for(Listener l:list){
                        l.onChange("hello");
                    }
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        t.setDaemon(true);
        t.start();
    }

    @Override
    public String say(String name) {
        return "Hello " + name;
    }

    @Override
    public void addListener(Listener lis) {
        list.add(lis);
    }

}
