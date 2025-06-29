package com.rafaelli.productcatalogapi.service;

import com.rafaelli.productcatalogapi.dto.ProductDTO;
import com.rafaelli.productcatalogapi.entity.Product;
import com.rafaelli.productcatalogapi.repository.ProductRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository productRepo;

    public ProductService(ProductRepository productRepo) {
        this.productRepo = productRepo;
    }

    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    public Product createProduct(ProductDTO productDTO) {
        Product product = new Product();
        BeanUtils.copyProperties(productDTO, product);

        return productRepo.save(product);
    }

    public Product deleteProduct(int id) {
        Optional<Product> optionalProduct = productRepo.findById(id);

        if (optionalProduct.isEmpty()) {
            throw new RuntimeException("Product with id " + id + " not found");
        }
        Product deletedProduct = optionalProduct.get();
        productRepo.delete(deletedProduct);
        return deletedProduct;
    }
}
