package ravi.hobby.project.CuisineDiaryApi.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ravi.hobby.project.CuisineDiaryApi.model.Recipe;

@SpringBootTest
class RecipeServiceTest {

    @Autowired
    private RecipeService recipeService;

    @Test
    void saveRecipe() {
        Recipe recipe = recipeService.saveRecipe(new Recipe("testRecipe1", "testIngredients", "", "", ""));
        assertEquals("testRecipe1", recipe.getName());
        assertEquals("testIngredients", recipe.getIngredients());
        assertEquals("", recipe.getNotes());
        assertEquals("", recipe.getServing());
        assertEquals("", recipe.getRefs());
    }

    @Test
    void getRecipes() {
        recipeService.saveRecipe(new Recipe("testRecipe2", "testIngredients", "", "", ""));
        List<Recipe> recipes = recipeService.getRecipies();
        assertTrue(recipes.size() >= 1);
        assertTrue(recipes.stream().anyMatch(recipe1 -> recipe1.getName().equals("testRecipe2")));
    }
}
