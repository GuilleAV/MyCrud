package com.codigowilli.mycrud.handler;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public HandlerRoot globalExceptionHandler() {
        return new HandlerRoot();
    }
}
