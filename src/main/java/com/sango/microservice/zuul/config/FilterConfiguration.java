package com.sango.microservice.zuul.config;

import com.sango.microservice.zuul.filter.ErrorFilter;
import com.sango.microservice.zuul.filter.PostFilter;
import com.sango.microservice.zuul.filter.PreFilter;
import com.sango.microservice.zuul.filter.RouteFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfiguration {
    @Bean
    public PreFilter preFilter(){return new PreFilter();};

    @Bean
    public PostFilter postFilter(){return new PostFilter();};

    @Bean
    public RouteFilter routeFilter(){return new RouteFilter();};

    @Bean
    public ErrorFilter errorFilter(){return new ErrorFilter();};
}
