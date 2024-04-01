package com.codigowilli.mycrud.handler;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UISwagger {
    @Bean
    public OpenAPI customUISwagger(){
        return new OpenAPI().info(new Info()
                .title("Code Willi")
                .version("1.0.0")
                .description("Sample BD Products")
                .termsOfService("http://swaggerl.io/terms/")
                .license(new License().name("Apache 2.0").url("http://springdoc.org")));
    }


}
