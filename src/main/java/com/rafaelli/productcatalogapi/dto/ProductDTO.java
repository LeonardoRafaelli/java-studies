package com.rafaelli.productcatalogapi.dto;

import java.math.BigDecimal;

public record ProductDTO(int id, String name, String description, BigDecimal price, String imageUrl) {
}
