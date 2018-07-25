package com.tlg.core;

import com.tlg.interceptor.LoginHendlerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;
import org.thymeleaf.templateresolver.ITemplateResolver;

/**
 * Created by JieChen on 2018/7/23.
 */
@Configuration
public class MvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/main.html").setViewName("websiteMgt");
        registry.addViewController("/index.html").setViewName("index");
    }

    //註冊攔截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
       registry.addInterceptor(new LoginHendlerInterceptor()).addPathPatterns("/**")
               .excludePathPatterns("/index.html", "/", "/api/login")
               .excludePathPatterns("/css/**")
               .excludePathPatterns("/js/**")
               .excludePathPatterns("/font/**")
               .excludePathPatterns("/img/**")
               .excludePathPatterns("/**/*.map");
//               .excludePathPatterns("/**/*.map")
//               .excludePathPatterns("/**/*.js")
//               .excludePathPatterns("/**/*.png")

    }
}
