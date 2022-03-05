package com.example.restfulwebservice.model;

public class GreetingMessage {

    private final long id;
    private final String message;
    private Data data;

    public GreetingMessage(long id, String message, Data data){
        this.id = id;
        this.message = message;
        this.data = data;
    }

    public long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public Data getData() {
        return data;
    }
}
