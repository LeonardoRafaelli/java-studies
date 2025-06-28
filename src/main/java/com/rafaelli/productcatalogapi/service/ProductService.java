package com.rafaelli.productcatalogapi.service;

import com.rafaelli.productcatalogapi.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductService {

    private final ProductRepository productRepo;

}
