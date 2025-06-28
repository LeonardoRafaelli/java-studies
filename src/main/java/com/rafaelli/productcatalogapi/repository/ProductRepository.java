package com.rafaelli.productcatalogapi.repository;

import com.rafaelli.productcatalogapi.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
