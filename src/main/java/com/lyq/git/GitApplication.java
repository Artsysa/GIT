package com.lyq.git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitApplication {

    public static void main(String[] args) {
        int i = 1;
        for (int j = 0; j < 2; j++) {
            i = i++;
        }
        System.out.println(i);
        SpringApplication.run(GitApplication.class, args);
    }

}
