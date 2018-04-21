package com.cr6588.config;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

/**
 * create in 2018年04月20日
 * @category TODO
 * @author chenyi
 */
//@Configuration
//注意，由于MapperScannerConfigurer执行的比较早，所以必须有下面的注解
//@AutoConfigureAfter({ SqlSessionFactoryConfig.class })
//使用@MapperScan替代
@Deprecated
public class MyBatisMapperScannerConfig {

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();

        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        mapperScannerConfigurer.setBasePackage("com.cr6588.dao");

        return mapperScannerConfigurer;
    }

}
