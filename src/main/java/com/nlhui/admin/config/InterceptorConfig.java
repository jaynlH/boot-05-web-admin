package com.nlhui.admin.config;

import com.nlhui.admin.interceptors.LoginInceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
    /**
     *
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInceptor()).
                addPathPatterns("/**").
                excludePathPatterns("/","/login","/css/**","/fonts/**","/images/**","/js/**");

    }

}
