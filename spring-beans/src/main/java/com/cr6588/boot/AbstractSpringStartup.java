package com.cr6588.boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;

/**
 * create in 2018年04月23日
 * @category TODO
 * @author chenyi
 */
public abstract class AbstractSpringStartup implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(AbstractSpringStartup.class);

    public abstract String getModuleName();

    public boolean isTest() {
        return false;
    }

    @Override
    public void run(String... args) throws Exception {
        if(isTest()) {
            return;
        }
        synchronized (this) {
            while (true) {
                try {
                    LOGGER.info(getModuleName() + "启动成功");
                    this.wait();
                } catch (InterruptedException e) {
                    LOGGER.error(e.getMessage(), e);
                }
            }
        }
    }

}
