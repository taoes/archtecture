package com.idev.architecture.event;

import com.google.common.eventbus.AsyncEventBus;
import com.google.common.eventbus.EventBus;

import javax.annotation.CheckForNull;
import java.util.Timer;
import java.util.concurrent.*;


public class EventBusFactory {

    public EventBus bus;

    public EventBusFactory(boolean async) {
        if (!async) {
            this.bus = new EventBus();
        } else {
            Executor executor = new ThreadPoolExecutor(2, 2, 60, TimeUnit.SECONDS, new ArrayBlockingQueue<>(100));
            this.bus = new AsyncEventBus("ASYNC", executor);
        }
    }


    public void register(Object listener) {
        this.bus.register(listener);
    }

    public void publishEvent(@CheckForNull Long id, String content) {
        assert id != null;
        System.out.println("send message:" + id.toString());
        this.bus.post(new EventMessage(id, content));
    }


}
