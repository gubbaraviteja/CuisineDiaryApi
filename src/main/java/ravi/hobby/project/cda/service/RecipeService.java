package ravi.hobby.project.cda.service;

import java.util.List;
import ravi.hobby.project.cda.model.Recipe;

public interface RecipeService {
    List<Recipe> getRecipes();

    Recipe saveRecipe(Recipe recipe);
}
