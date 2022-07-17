package com.spring_test.Blog;

import com.spring_test.Blog.builders.MusicBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanTester {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MusicBuilder);

        System.out.println(music.getGenre());
    }
}
