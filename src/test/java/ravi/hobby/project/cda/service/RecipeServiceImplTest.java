package ravi.hobby.project.cda.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ravi.hobby.project.cda.model.Ingredient;
import ravi.hobby.project.cda.model.Recipe;

@SpringBootTest
class RecipeServiceImplTest {

    @Autowired
    private RecipeService RecipeService;

    @Test
    void saveRecipe() {
        Recipe recipe = RecipeService.saveRecipe(new Recipe("testRecipe1", List.of(new Ingredient("testIngredients")), "", "", ""));
        assertEquals("testRecipe1", recipe.getName());
        assertEquals(1, recipe.getIngredients().size());
        assertEquals("", recipe.getNotes());
        assertEquals("", recipe.getServing());
        assertEquals("", recipe.getRefs());
    }

    @Test
    void getRecipes() {
        RecipeService.saveRecipe(new Recipe("testRecipe2", List.of(new Ingredient("testIngredients")), "", "", ""));
        List<Recipe> recipes = RecipeService.getRecipes();
        assertTrue(recipes.size() >= 1);
        assertTrue(recipes.stream().anyMatch(recipe1 -> recipe1.getName().equals("testRecipe2")));
    }
}
