package com.spring_test.Blog.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.spring_test.Blog.beans.music.*;

@Configuration
public class AppConfig {
    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }
}
