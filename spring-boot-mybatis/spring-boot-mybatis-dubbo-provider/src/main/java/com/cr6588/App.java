package com.cr6588;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import com.cr6588.boot.AbstractSpringStartup;


@MapperScan("com.cr6588.dao")
@ImportResource("classpath:dubbo-provider.xml")
@SpringBootApplication
public class App extends AbstractSpringStartup {

    public static void main(String[] args) throws Exception {
        SpringApplication app = new SpringApplication(App.class);
//         app.setAdditionalProfiles("dev");
         app.run(args);
    }

//    @Override
//    public boolean isTest() {
//        return true;
//    }

    @Override
    public String getModuleName() {
        return "provider";
    }

    
}
