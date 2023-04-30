package com.idev.architecture.event;

import com.alibaba.fastjson2.JSON;
import com.google.common.eventbus.AllowConcurrentEvents;
import com.google.common.eventbus.Subscribe;

public class StartUp {

    public static void main(String[] args) throws InterruptedException {
        EventBusFactory factory = new EventBusFactory(false);
        factory.register(new StartUp());
        for (int i = 0; i < 64; i++) {
            factory.publishEvent((long) i, "content:" + i);
        }


        Thread.sleep(1_000_000);
    }


    @Subscribe
    @AllowConcurrentEvents
    public void handleEventMessage(EventMessage message) {
        System.out.printf("thread's id= %d,msg=[%s]\n", Thread.currentThread().getId(), JSON.toJSONString(message));
    }
}
