package ravi.hobby.project.cda.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ravi.hobby.project.cda.model.Recipe;
import ravi.hobby.project.cda.repository.RecipeRepository;

@Service
public class RecipeService {

    @Autowired
    private RecipeRepository recipeRepository;

    public List<Recipe> getRecipies() {
        return StreamSupport.stream(recipeRepository.findAll().spliterator(), true).collect(Collectors.toList());
    }

    public Recipe saveRecipe(Recipe recipe) {
        return recipeRepository.save(recipe);
    }
}
