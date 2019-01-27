package ravi.hobby.project.CuisineDiaryApi.repository;

import org.springframework.data.repository.CrudRepository;
import ravi.hobby.project.CuisineDiaryApi.model.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Integer> {
}
