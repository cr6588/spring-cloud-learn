package com.cr6588;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;


//@MapperScan("com.cr6588.dao")
@ImportResource("classpath:dubbo-provider.xml")
@SpringBootApplication
public class App implements CommandLineRunner {

    public static void main(String[] args) throws Exception {
        SpringApplication app = new SpringApplication(App.class);
//         app.setAdditionalProfiles("dev");
         app.run(args);
    }

    @Override
    public void run(String... args) throws Exception {
        if(isTest()) {
            return;
        }
//        synchronized (this) {
//            while (true) {
//                try {
//                    this.wait();
//                } catch (InterruptedException e) {
//                }
//            }
//        }
    }

    public boolean isTest() {
        return false;
    }

    
}
