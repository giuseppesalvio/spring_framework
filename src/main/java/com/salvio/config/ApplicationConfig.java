package com.salvio.config;

import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan(basePackages = "com.salvio")
public class ApplicationConfig {
}
