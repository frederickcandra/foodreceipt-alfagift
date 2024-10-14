package com.feature.foodreceipt.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class RecipeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @Column(length = 1000)
    private String instructions;

    @JsonManagedReference // Anotasi untuk mengelola sisi ini dari referensi
    @OneToMany(mappedBy = "recipe", cascade = CascadeType.ALL)
    private List<ProductModel> products = new ArrayList<>();

}
