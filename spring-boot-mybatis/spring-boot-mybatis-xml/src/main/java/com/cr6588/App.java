package com.cr6588;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 */
@SpringBootApplication
@MapperScan("com.cr6588.dao")
public class App {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(App.class, args);
    }
}
