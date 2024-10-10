package com.feature.foodreceipt.controller;

import com.feature.foodreceipt.model.RecipeModel;
import com.feature.foodreceipt.service.FoodReceiptService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/food-receipts")
public class FoodReceiptController {
    private final FoodReceiptService foodReceiptService;

    public FoodReceiptController(FoodReceiptService foodReceiptService) {
        this.foodReceiptService = foodReceiptService;
    }

    @GetMapping("/recipes")
    public List<RecipeModel>getAllReceipts(){
        return foodReceiptService.getAllRecipes();
    }

    @GetMapping("/recipes/{id}")
    public RecipeModel getReceiptById (@PathVariable Long id){
        return foodReceiptService.getRecipeById(id);
    }



}
