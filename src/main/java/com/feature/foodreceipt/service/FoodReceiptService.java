package com.feature.foodreceipt.service;

import com.feature.foodreceipt.model.RecipeModel;
import com.feature.foodreceipt.repository.FoodReceiptRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodReceiptService {

    private final FoodReceiptRepository foodReceiptRepository;

    public FoodReceiptService(FoodReceiptRepository foodReceiptRepository) {
        this.foodReceiptRepository = foodReceiptRepository;
    }

    public List<RecipeModel> getAllRecipes() {
        return foodReceiptRepository.findAll();
    }

    public RecipeModel getRecipeById(Long id) {
        return foodReceiptRepository.findById(id).orElse(null);

    }

}
