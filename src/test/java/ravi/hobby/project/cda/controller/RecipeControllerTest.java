package ravi.hobby.project.cda.controller;

import com.fasterxml.jackson.core.type.TypeReference;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import ravi.hobby.project.cda.model.Ingredient;
import ravi.hobby.project.cda.model.Recipe;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@AutoConfigureMockMvc
@SpringBootTest
class RecipeControllerTestIT {
    @Autowired
    private MockMvc mockMvc;

    @Test
    void UserShouldBeAbleToRetrieveRecipe() throws Exception {
        String uri = "/recipe/";
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get(uri)
                .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();

        int status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);
        String content = mvcResult.getResponse().getContentAsString();
        List<Recipe> recipes = TestUtil.mapFromJson(content, new TypeReference<>() {
        });
        assertTrue(recipes.size() > 0);


    }

    @Test
    void UserShouldBeAbleToSaveRecipe() throws Exception {
        String uri = "/recipe/";
        Recipe recipe = new Recipe("testRecipe1", List.of(new Ingredient("testIngredients")), "", "", "");
        String inputJson = TestUtil.mapToJson(recipe);
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.post(uri)
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .content(inputJson)).andReturn();

        int status = mvcResult.getResponse().getStatus();
        assertEquals(201, status);
        String content = mvcResult.getResponse().getContentAsString();
        Recipe savedRecipe = TestUtil.mapFromJson(content, Recipe.class);
        assertEquals("testRecipe1", savedRecipe.getName());
        assertEquals(1, savedRecipe.getIngredients().size());
        assertEquals("testIngredients", savedRecipe.getIngredients().get(0).getName());
        assertEquals("", savedRecipe.getNotes());
        assertEquals("", savedRecipe.getServing());
        assertEquals("", savedRecipe.getRefs());
    }

}
