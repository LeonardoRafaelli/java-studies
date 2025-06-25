package com.rafaelli.productcatalogapi.entity;

import com.rafaelli.productcatalogapi.dto.ProductDTO;
import lombok.ToString;

import java.math.BigDecimal;


class Laptop {
    String model;
    int year;

    public String toString() {
        return "Model: " + this.model;
    }

    public void printMe(){
        System.out.println(this);
    }
}

public class test {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.year = 2018;
//        laptop.toString();
        laptop.printMe();
//        System.out.println(laptop);
        BigDecimal bd = new BigDecimal("1.23");
        ProductDTO pdto = new ProductDTO(1, "my", "kd", bd, "dkf");
    }
}
