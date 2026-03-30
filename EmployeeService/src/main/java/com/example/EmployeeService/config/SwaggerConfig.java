package com.example.EmployeeService.config;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
    public class SwaggerConfig {

        @Bean
        public OpenAPI customOpenAPI() {
            return new OpenAPI()
                    .info(new Info()
                            .title("Employee Service API")
                            .version("1.0")
                            .description("Spring Boot Employee CRUD API documentation")
                            .contact(new Contact()
                                    .name("Harsha")
                                    .email("harsha@example.com")));
        }
    }

