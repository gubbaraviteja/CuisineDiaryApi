package ravi.hobby.project.cda.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ravi.hobby.project.cda.dto.RecipeDTO;
import ravi.hobby.project.cda.model.Recipe;
import ravi.hobby.project.cda.service.RecipeService;

@RestController
public class RecipeController {

    @Autowired
    RecipeService recipeService;

    @GetMapping(value = "/recipe/")
    public ResponseEntity<List<Recipe>> getRecipes() {
        return ResponseEntity.ok(recipeService.getRecipies());
    }

    @PostMapping(value = "/recipe/save")
    public ResponseEntity<Recipe> saveRecipe(@RequestBody RecipeDTO recipeDTO) {
        Recipe recipe = recipeService.saveRecipe(recipeDTO.buildRecipe());
        return ResponseEntity.ok(recipe);
    }
}
