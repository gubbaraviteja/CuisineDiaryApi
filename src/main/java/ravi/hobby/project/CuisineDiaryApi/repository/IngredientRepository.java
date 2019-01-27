package ravi.hobby.project.CuisineDiaryApi.repository;

import org.springframework.data.repository.CrudRepository;
import ravi.hobby.project.CuisineDiaryApi.model.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, Integer> {
}
