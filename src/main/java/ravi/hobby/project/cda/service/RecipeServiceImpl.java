package ravi.hobby.project.cda.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import org.springframework.stereotype.Service;
import ravi.hobby.project.cda.model.Recipe;
import ravi.hobby.project.cda.repository.RecipeRepository;

@Service
public class RecipeServiceImpl implements RecipeService {

    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public List<Recipe> getRecipes() {
        return StreamSupport.stream(recipeRepository.findAll().spliterator(), true).collect(Collectors.toList());
    }

    @Override
    public Recipe saveRecipe(Recipe recipe) {
        return recipeRepository.save(recipe);
    }
}
