package com.example.restfulwebservice.model;

public class GreetingMessage {

    private final long id;
    private final String message;

    public GreetingMessage(long id, String message){
        this.id = id;
        this.message = message;
    }

    public long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }
}
