package com.feature.foodreceipt.controller;

import com.feature.foodreceipt.dto.ProductDTO;
import com.feature.foodreceipt.model.ProductModel;
import com.feature.foodreceipt.model.RecipeModel;
import com.feature.foodreceipt.repository.ProductRepository;
import com.feature.foodreceipt.repository.RecipeRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    private final ProductRepository productRepository;
    private final RecipeRepository recipeRepository;

    public ProductController(ProductRepository productRepository, RecipeRepository recipeRepository) {
        this.productRepository = productRepository;
        this.recipeRepository = recipeRepository;
    }

    @PostMapping("/addProduct/{recipeId}")
    public ResponseEntity<ProductDTO> addProductToRecipe(
            @PathVariable Long recipeId,
            @RequestBody ProductModel product) {

        Optional<RecipeModel> recipeOpt = recipeRepository.findById(recipeId);
        if (recipeOpt.isPresent()) {
            RecipeModel recipe = recipeOpt.get();
            product.setRecipe(recipe);
            ProductModel savedProduct = productRepository.save(product);

            // Mengonversi ke DTO untuk respons
            ProductDTO productDTO = new ProductDTO();
            productDTO.setId(savedProduct.getId());
            productDTO.setName(savedProduct.getName());
            productDTO.setPrice(savedProduct.getPrice());
            productDTO.setCategory(savedProduct.getCategory());
            productDTO.setDescription(savedProduct.getDescription());
            productDTO.setPurchaseLink(savedProduct.getPurchaseLink());

            return ResponseEntity.ok(productDTO);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
