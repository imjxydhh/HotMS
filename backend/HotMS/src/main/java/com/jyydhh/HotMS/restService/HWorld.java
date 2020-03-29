package com.jyydhh.HotMS.restService;

public class HWorld {
    private final long id;
    private final String content;

    public HWorld(long id, String content){
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
