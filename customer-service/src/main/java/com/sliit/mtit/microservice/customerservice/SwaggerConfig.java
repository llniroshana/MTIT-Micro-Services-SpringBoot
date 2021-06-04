package com.sliit.mtit.microservice.customerservice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket swaggerApiConfig() {

        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .paths(PathSelectors.any())
                .apis(RequestHandlerSelectors.basePackage("com.sliit.mtit.microservice.customerservice"))
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {

        return new ApiInfo(
                "Swagger API",
                "API Reference - MTIT Assignment 4",
                "1.0.0",
                "Public API",
                new Contact(
                        "MTIT",
                        "https://mvnrepository.com/artifact/io.springfox/springfox-swagger2/2.9.2",
                        "mtit@my.sliit.lk"),
                "API Dashboard",
                "http://localhost:8080/swagger-ui.html#/",
                Collections.emptyList()
        );
    }
}