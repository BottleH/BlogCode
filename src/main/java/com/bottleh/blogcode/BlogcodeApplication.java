package com.bottleh.blogcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class BlogcodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogcodeApplication.class, args);
    }

}
