package com.cr6588.config;

import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * 更简单的方式是在vue中config/index.js 配置proxyTable进行代理访问
 * create in 2018年8月15日
 * @category 生产环境中不能使用，用于vue跨域访问
 * @author chenyi
 */
@Deprecated
public class CorsConfig {
    /**
     允许任何域名使用
     允许任何头
     允许任何方法（post、get等）
     */
    private CorsConfiguration buildConfig() {
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        // addAllowedOrigin 不能设置为* 因为与 allowCredential 冲突
        corsConfiguration.addAllowedOrigin("http://localhost:8080");
        corsConfiguration.addAllowedHeader("*");
        corsConfiguration.addAllowedMethod("*");
        // allowCredential 需设置为true
        corsConfiguration.setAllowCredentials(true);
        return corsConfiguration;
    }

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", buildConfig());
        return new CorsFilter(source);
    }
}