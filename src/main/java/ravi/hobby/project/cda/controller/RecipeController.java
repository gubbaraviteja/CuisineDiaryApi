package ravi.hobby.project.cda.controller;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ravi.hobby.project.cda.dto.RecipeDTO;
import ravi.hobby.project.cda.model.Recipe;
import ravi.hobby.project.cda.service.RecipeService;

@RestController
@RequestMapping("/recipe/")
public class RecipeController {

    final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping
    public ResponseEntity<List<Recipe>> getRecipes() {
        return ResponseEntity.ok(recipeService.getRecipes());
    }

    @PostMapping
    public ResponseEntity<Recipe> saveRecipe(@RequestBody RecipeDTO recipeDTO) {
        Recipe recipe = recipeService.saveRecipe(recipeDTO.buildRecipe());
        return ResponseEntity.status(HttpStatus.CREATED).body(recipe);
    }
}
