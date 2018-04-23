package com.cr6588.boot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

/**
 * create in 2018年04月23日
 * @category TODO
 * @author chenyi
 */
public abstract class AbstractSpringStartup implements CommandLineRunner {

    private String[] args;

    public String[] getArgs() {
        return args;
    }

    public void setArgs(String[] args) {
        this.args = args;
    }

    public AbstractSpringStartup() {
        super();
    }

    public AbstractSpringStartup(String... args) {
        super();
        this.args = args;
        init();
    }

    public void init() {
        SpringApplication app = new SpringApplication(this.getClass());
        app.run(args);
    }

    public static void init(Class<? extends AbstractSpringStartup> clazz, String... args) {
        SpringApplication app = new SpringApplication(clazz);
        app.run(args);
    }

    @Override
    public void run(String... args) throws Exception {
        synchronized (this) {
            while (true) {
                try {
                    this.wait();
                } catch (InterruptedException e) {
                }
            }
        }
    }

}
