package ravi.hobby.project.CuisineDiaryApi.controller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ravi.hobby.project.CuisineDiaryApi.model.Recipe;
import ravi.hobby.project.CuisineDiaryApi.repository.RecipeRepository;

@Service
public class CuisineDiaryService {

    @Autowired
    private RecipeRepository recipeRepository;

    public Iterable<Recipe> getRecipies(){
        return recipeRepository.findAll();
    }

    public Recipe saveRecipe(Recipe recipe) {
        return recipeRepository.save(recipe);
    }
}
