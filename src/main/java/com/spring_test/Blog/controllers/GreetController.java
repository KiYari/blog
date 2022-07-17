package com.spring_test.Blog.controllers;

import com.spring_test.Blog.api.GreetBlock;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetController {
    private static final String template = "hello, %s";
    private final AtomicInteger counter = new AtomicInteger();

    @RequestMapping("/api/greets")
    public GreetBlock greeting(@RequestParam(value="name", required=false, defaultValue="World") String name) {
        return new GreetBlock(counter.incrementAndGet(),
                String.format(template, name));
    }
}
