package com.sxd.gitdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitdemoApplication {

    public static void main(String[] args) {
        System.out.println("hello world");
        System.out.println("错的不是我是这个世界");
        SpringApplication.run(GitdemoApplication.class, args);
    }

}
