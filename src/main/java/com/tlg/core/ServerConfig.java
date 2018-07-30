package com.tlg.core;

import com.tlg.filter.MyFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;

import org.springframework.context.annotation.Bean;

import java.util.*;
import org.springframework.context.annotation.Configuration;

/**
 * Created by JieChen on 2018/7/30.
 */
@Configuration
public class ServerConfig {
    @Bean
    public FilterRegistrationBean filterRegistration() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new MyFilter());
        filterRegistrationBean.setUrlPatterns(Arrays.asList("/toAddMember","/login"));
        return filterRegistrationBean;
    }

//    @Bean
//    public ServletListenerRegistrationBean servletListenerRegistrationBean() {
//        ServletListenerRegistrationBean servletListenerRegistrationBean = new ServletListenerRegistrationBean();
//        return servletListenerRegistrationBean;
//    }

}
