package com.cr6588.config;

import org.hibernate.validator.HibernateValidator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * create in 2018年08月22日
 * @category
 * @author chenyi
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    // <!-- 指定自己定义的validator -->
    // <mvc:annotation-driven validator="validator"/>
    // <!-- 以下 validator ConversionService 在使用 mvc:annotation-driven 会 自动注册-->
    // <bean id="validator"
    // class="org.springframework.validation.beanvalidation.LocalValidatorFactoryBean">
    // <property name="providerClass"
    // value="org.hibernate.validator.HibernateValidator"/>
    // </bean>
    @Override
    public Validator getValidator() {
        return validator();
    }

    @Bean
    public Validator validator() {
        LocalValidatorFactoryBean validator = new LocalValidatorFactoryBean();
        validator.setProviderClass(HibernateValidator.class);
        return validator;
    }

}
