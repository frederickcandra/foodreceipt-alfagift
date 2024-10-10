package com.feature.foodreceipt.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ProductDTO {
    private Long id;
    private String name;
    private Double price;
    private String category;
    private String description;
    private String purchaseLink;
}
