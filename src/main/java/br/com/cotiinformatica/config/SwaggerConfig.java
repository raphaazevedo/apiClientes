package br.com.cotiinformatica.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {
	
	@Bean
	public OpenAPI cusOpenAPI() {
		
		return new OpenAPI().components(new Components())
				.info(new Info()
						.title("API Clientes - COTI Informatica")
						.description("Projeto Spring Boot API para copntrole de clientes")
						.version("v1"));
	}
}
