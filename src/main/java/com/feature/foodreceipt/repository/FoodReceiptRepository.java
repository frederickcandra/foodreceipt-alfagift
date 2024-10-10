package com.feature.foodreceipt.repository;

import com.feature.foodreceipt.model.RecipeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FoodReceiptRepository extends JpaRepository<RecipeModel, Long> {
    List<RecipeModel> findAll();
    Optional<RecipeModel> findById(Long id);
}
