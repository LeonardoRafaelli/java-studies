package com.rafaelli.productcatalogapi.controller;

import com.rafaelli.productcatalogapi.entity.Product;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;

@RestController
@RequestMapping("/product")
public class ProductController {

    @PostConstruct
    public void init(){
        System.out.println(">>> ProductController started");
    }

    @GetMapping
    public Product getAllProducts() {
        Product product = new Product();
        product.setId(1);
        product.setName("Product 1");
        product.setDescription("Product 1");
        product.setPrice(new BigDecimal("2.22"));

        return product;
    }
}

