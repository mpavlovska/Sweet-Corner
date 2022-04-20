package com.example.sweetcorner.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Double price;

    private Integer quantity;

    private String image;

    @ManyToOne
    private Category category;

    public Product() {
    }

    public Product(String name, Double price, Integer quantity, Category category) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    public String getCategoryName() {
        return category.getName();
    }

    public String getCategoryDescription() {
        return category.getDescription();
    }
}
