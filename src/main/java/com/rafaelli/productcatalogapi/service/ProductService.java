package com.rafaelli.productcatalogapi.service;

import com.rafaelli.productcatalogapi.dto.ProductDTO;
import com.rafaelli.productcatalogapi.entity.Product;
import com.rafaelli.productcatalogapi.repository.ProductRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.beans.BeanProperty;
import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepo;

    public ProductService(ProductRepository productRepo) {
        this.productRepo = productRepo;
    }

    public List<Product> getAllProducts () {
        return productRepo.findAll();
    }

    public Product createProduct(ProductDTO productDTO) {
        Product product = new Product();
        BeanUtils.copyProperties(productDTO, product);

        return productRepo.save(product);
    }
}
