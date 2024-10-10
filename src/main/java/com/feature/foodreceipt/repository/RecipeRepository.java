package com.feature.foodreceipt.repository;

import com.feature.foodreceipt.model.RecipeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepository extends JpaRepository<RecipeModel, Long> {

}
