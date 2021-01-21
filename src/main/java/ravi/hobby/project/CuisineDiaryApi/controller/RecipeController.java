package ravi.hobby.project.CuisineDiaryApi.controller;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ravi.hobby.project.CuisineDiaryApi.service.RecipeService;
import ravi.hobby.project.CuisineDiaryApi.model.Recipe;

@RestController
public class RecipeController {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    RecipeService recipeService;

    @GetMapping(value = "/recipe/")
    public ResponseEntity<List<Recipe>> getRecipes(){
        return ResponseEntity.ok(recipeService.getRecipies());
    }

    @PostMapping(value = "/recipe/save")
    public ResponseEntity<Recipe> saveRecipe(@RequestBody Recipe recipe){
        recipeService.saveRecipe(recipe);
        return ResponseEntity.ok(recipeService.saveRecipe(recipe));
    }
}
