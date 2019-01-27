package ravi.hobby.project.CuisineDiaryApi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ravi.hobby.project.CuisineDiaryApi.controller.service.CuisineDiaryService;
import ravi.hobby.project.CuisineDiaryApi.model.Recipe;

@RestController
public class RecipeController {
    @Autowired
    CuisineDiaryService cuisineDiaryService;

    @GetMapping(value = "/recipe/")
    public ResponseEntity getRecipes(){
//        return ResponseEntity.ok("This endpoint is responsible for retrieving all recipes");
        return ResponseEntity.ok(cuisineDiaryService.getRecipies());
    }

    @PostMapping(value = "/recipe/save")
    public ResponseEntity saveRecipe(@RequestBody Recipe recipe){
        cuisineDiaryService.saveRecipe(recipe);
        return ResponseEntity.ok(cuisineDiaryService.saveRecipe(recipe));
    }
}
