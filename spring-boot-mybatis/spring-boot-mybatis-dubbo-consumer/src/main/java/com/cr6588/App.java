package com.cr6588;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 */
@SpringBootApplication
public class App {

    public static void main(String[] args) throws Exception {
        SpringApplication app = new SpringApplication(App.class);
//        //启动dev配置文件
//        Map<String, Object> defaultProperties = new HashMap<String, Object>();
//        defaultProperties.put("spring.profiles.active", "dev");
//        app.setDefaultProperties(defaultProperties);
        app.run(args);
    }
}
