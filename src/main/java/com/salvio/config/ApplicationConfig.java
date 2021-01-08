package com.salvio.config;

import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan(basePackages = "com.salvio")
@EnableAspectJAutoProxy
public class ApplicationConfig {
}
