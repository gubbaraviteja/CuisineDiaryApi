package ravi.hobby.project.CuisineDiaryApi.model;

import javax.persistence.*;

@Entity
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;

    @Column
    private String ingredients;   //TODO: Create separate entity named Ingredient and associate to Recipe

    @Column
    private String notes;

    @Column
    private String serving;

    @Column
    private String refs;

    public Recipe() {
    }

    public Recipe(String name, String ingredients, String notes, String serving, String refs) {
        super();
        this.name = name;
        this.ingredients = ingredients;
        this.notes = notes;
        this.serving = serving;
        this.refs = refs;
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

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
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
