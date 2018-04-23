package com.cr6588;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import com.cr6588.boot.AbstractSpringStartup;

/**
 * Hello world!
 */
@SpringBootApplication
@MapperScan("com.cr6588.dao")
@ImportResource({"classpath:dubbo-provider.xml"})
public class App extends AbstractSpringStartup {

    
    public App(String... args) {
        super(args);
    }

    public App() {
        super();
    }

    public static void main(String[] args) throws Exception {
        new App(args);
    }


}
