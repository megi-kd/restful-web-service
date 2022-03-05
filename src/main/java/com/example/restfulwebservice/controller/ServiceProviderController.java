package com.example.restfulwebservice.controller;

import com.example.restfulwebservice.model.Data;
import com.example.restfulwebservice.model.GreetingMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class ServiceProviderController {

    public final static String MESSAGE = "This is the resulting displaying message for %s";
    public final AtomicLong counter = new AtomicLong();

    @GetMapping
    public String welcome(){
        return "Welcome!!!";
    }


    @GetMapping("/greeting")
    public GreetingMessage getMessage(
            @RequestParam(value = "name", defaultValue = "Maggie", required = false) String name){

        return new GreetingMessage(
                counter.incrementAndGet(),
                String.format(MESSAGE, name),
                new Data(counter.incrementAndGet(), "Special quote!"));
    }

}
