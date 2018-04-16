package com.cr6588;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Lazy;

/**
 * Hello world!
 */
@SpringBootApplication
@ImportResource({"classpath:dubbo-consumer.xml"})
public class App {

    public static void main(String[] args) throws Exception {
        SpringApplication app = new SpringApplication(App.class);
        //启动dev配置文件
        app.setAdditionalProfiles("dev");   // dev 或prod
        app.run(args);
    }
}
