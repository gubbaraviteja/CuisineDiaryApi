package ravi.hobby.project.cda.dto;

import java.util.List;
import java.util.stream.Collectors;
import ravi.hobby.project.cda.model.Recipe;

public class RecipeDTO {
    private long id;
    private String name;
    private List<IngredientDTO> ingredients;
    private String notes;
    private String serving;
    private String refs;

    public RecipeDTO() {
    }

    public RecipeDTO(String name, List<IngredientDTO> ingredients, String notes, String serving, String refs) {
        super();
        this.name = name;
        this.ingredients = ingredients;
        this.notes = notes;
        this.serving = serving;
        this.refs = refs;
    }

    public Recipe buildRecipe() {
        Recipe recipe = new Recipe();
        recipe.setName(this.name);
        recipe.setIngredients(this.ingredients.stream().map(IngredientDTO::buildIngredient).collect(Collectors.toList()));
        recipe.setNotes(this.notes);
        recipe.setServing(this.serving);
        recipe.setRefs(this.refs);
        return recipe;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<IngredientDTO> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<IngredientDTO> ingredients) {
        this.ingredients = ingredients;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getServing() {
        return serving;
    }

    public void setServing(String serving) {
        this.serving = serving;
    }

    public String getRefs() {
        return refs;
    }

    public void setRefs(String refs) {
        this.refs = refs;
    }
}
