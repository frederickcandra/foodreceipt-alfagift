package com.feature.foodreceipt.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class RecipeDTO {
    private Long id;
    private String name;
    private String instructions;
}
