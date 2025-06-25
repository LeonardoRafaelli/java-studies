package com.rafaelli.productcatalogapi.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;

import java.math.BigDecimal;

@Entity
@Data
public class Product {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String description;
    private BigDecimal price;
    private String imageUrl;
}
