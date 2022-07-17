package com.spring_test.Blog.api;

public class GreetBlock {
    private final int id;
    private final String name;

    public GreetBlock(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return name;
    }


}
