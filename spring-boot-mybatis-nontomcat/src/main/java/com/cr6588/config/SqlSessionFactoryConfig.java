package com.cr6588.config;

import java.io.IOException;

import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

/**
 * create in 2018年04月20日
 * @category TODO
 * @author chenyi
 */
@Configuration
public class SqlSessionFactoryConfig {

    @Autowired
    DataSource datasource;

    @Value("${mybatis.config-location}")
    private String configLocation;

    @Value("${mybatis.mapper-locations}")
    private String mapperLocations;

    private Logger logger = LoggerFactory.getLogger(SqlSessionFactoryConfig.class);

    

//    @Bean(name = "datasource")
//    public DataSource dataSource() {
//        DruidDataSource userDb = new DruidDataSource();
//        userDb.setDriverClassName("com.mysql.jdbc.Driver");
//        userDb.setUrl("jdbc:mysql://localhost/spring-cloud-learn?useUnicode=true&characterEncoding=utf-8");
//        userDb.setUsername("dev");
//        userDb.setPassword("dev");
//        userDb.setInitialSize(1);
//        userDb.setMinIdle(1);
//        userDb.setMaxActive(20);
//        userDb.setMaxWait(60000);
//        userDb.setTimeBetweenEvictionRunsMillis(60000);
//        userDb.setMinEvictableIdleTimeMillis(30000);
//        userDb.setValidationQuery("SELECT 'x'");
//        userDb.setTestWhileIdle(true);
//        userDb.setTestOnBorrow(false);
//        userDb.setTestOnReturn(false);
//        userDb.setPoolPreparedStatements(false);
//        userDb.setMaxPoolPreparedStatementPerConnectionSize(20);
//        return userDb;
//    }

    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactoryBean sessionFactory() {
        try {
            SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
            sessionFactoryBean.setDataSource(datasource);

            // 配置mapper的扫描，找到所有的mapper.xml映射文件
            Resource[] resources = new PathMatchingResourcePatternResolver()
                    .getResources(mapperLocations);
            sessionFactoryBean.setMapperLocations(resources);

            // 加载全局的配置文件
            sessionFactoryBean.setConfigLocation(
                    new DefaultResourceLoader().getResource(configLocation));
            return sessionFactoryBean;
        } catch (IOException e) {
            logger.warn("mybatis resolver mapper*xml is error");
            return null;
        } catch (Exception e) {
            logger.warn("mybatis sqlSessionFactoryBean create error");
            return null;
        }
    }
}
