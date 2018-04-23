package com.cr6588;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Hello world!
 */
@SpringBootApplication
//@EnableTransactionManagement 
@MapperScan("com.cr6588.dao")
@ImportResource({"classpath:dubbo-provider.xml"})
public class App {

    //--spring.profiles.active=prod
    public static void main(String[] args) throws Exception {
        SpringApplication app = new SpringApplication(App.class);
        app.setWebEnvironment(false);
//        1在application-dev.properties中可以使用${spring.profiles.active}.会被命令行覆盖
        Map<String, Object> defaultProperties = new HashMap<String, Object>();
        defaultProperties.put("spring.profiles.active", "dev");
        app.setDefaultProperties(defaultProperties);
//        2.在application-dev.properties中无法使用${spring.profiles.active}
//        app.setAdditionalProfiles("dev");
        //3.--spring.profiles.active=prod
        app.run(args);
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
