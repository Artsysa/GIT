package com.lyq.git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitApplication {

    public static void main(String[] args) {
        int i = 1;
        System.out.println(i);
        SpringApplication.run(GitApplication.class, args);
    }

}
