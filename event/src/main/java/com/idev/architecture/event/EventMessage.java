package com.idev.architecture.event;

import lombok.Data;

@Data
public class EventMessage {

    private Long id;

    private String content;

    public EventMessage(Long id, String content) {
        this.id = id;
        this.content = content;
    }
}
