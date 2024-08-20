package com.example.productapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.example.productapi.model")
public class ProductapiApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductapiApplication.class, args);

	}

}
