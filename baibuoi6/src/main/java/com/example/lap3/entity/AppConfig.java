package com.example.lap3.entity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {
    @Bean
    public List<Product> getProducts() {

        List< Product> products = new ArrayList<>();
        Product product1 =new Product();
        product1.setId(1);
        product1.setName("Son");
        product1.setImage("1.jpg");
        product1.setPrice(10);
        products.add(product1);

        Product product2 =new Product();
        product2.setId(2);
        product2.setName("Tri");
        product2.setImage("2.jpg");
        product2.setPrice(8);
        products.add(product2);
        return products;
    }
}