package com.feature.foodreceipt.controller;

import com.feature.foodreceipt.model.RecipeModel;
import com.feature.foodreceipt.repository.RecipeRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/recipe")
public class RecipeController {

    private RecipeRepository recipeRepository;

    public RecipeController(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }
    @PostMapping("/addRecipe")
    public ResponseEntity<RecipeModel> addRecipe(@RequestBody RecipeModel recipeModel) {
        RecipeModel savedRecipe = recipeRepository.save(recipeModel);
        return  ResponseEntity.ok(savedRecipe);
    }


}
