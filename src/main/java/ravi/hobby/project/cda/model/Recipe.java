package ravi.hobby.project.cda.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Table(name = "recipe")
@Entity
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;

    @OneToMany(
            mappedBy = "recipe",
            cascade = CascadeType.ALL)
    private List<Ingredient> ingredients = new ArrayList<>();
    @Column
    private String notes;
    @Column
    private String serving;
    @Column
    private String refs;

    public Recipe() {
    }

    public Recipe(String name, List<Ingredient> ingredients, String notes, String serving, String refs) {
        super();
        this.name = name;
        this.ingredients = ingredients;
        this.notes = notes;
        this.serving = serving;
        this.refs = refs;
    }

    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
        ingredient.setRecipe(this);
    }

    public void removeIngredient(Ingredient ingredient) {
        ingredients.remove(ingredient);
        ingredient.setRecipe(null);
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

    public List<Ingredient> getIngredients() {
        return ingredients;
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
