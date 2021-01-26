package ravi.hobby.project.cda.dto;

import ravi.hobby.project.cda.model.Ingredient;

public class IngredientDTO {
    private long id;
    private String name;

    public Ingredient buildIngredient(){
        return new Ingredient(this.name);
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
}
