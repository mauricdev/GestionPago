package com.everis.beca.GestionPago.config;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
public class WebMvcConfig  implements WebMvcConfigurer {
	  private static final long MAX_AGE_SECS = 3600;

	    @Override
	    public void addCorsMappings(CorsRegistry registry) {
	        registry.addMapping("/*")
	                .allowedOrigins("")
	                .allowedMethods("HEAD", "OPTIONS", "GET", "POST", "PUT", "PATCH", "DELETE")
	                .maxAge(MAX_AGE_SECS);
	    }

	    @Bean
	    public RestTemplate restTemplate() {
	        return new RestTemplate();
	    }
}
