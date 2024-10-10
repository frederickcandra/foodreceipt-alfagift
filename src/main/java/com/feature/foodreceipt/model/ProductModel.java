package com.feature.foodreceipt.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class ProductModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double price;
    private String category;
    private String description;
    private String purchaseLink;

    @JsonBackReference // Anotasi untuk menghindari referensi siklik
    @ManyToOne
    @JoinColumn(name = "recipe_id")

    private RecipeModel recipe;

}
