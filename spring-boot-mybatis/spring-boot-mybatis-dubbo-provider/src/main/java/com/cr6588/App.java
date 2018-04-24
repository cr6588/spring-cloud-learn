package com.cr6588;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Hello world!
 */
@SpringBootApplication
@MapperScan("com.cr6588.dao")
@ImportResource("classpath:dubbo-provider.xml")
public class App {

    public static void main(String[] args) throws Exception {
        SpringApplication app = new SpringApplication(App.class);
//        app.setAdditionalProfiles("prod");
        app.run(args);
    }

    

}
