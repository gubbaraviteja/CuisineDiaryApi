package ravi.hobby.project.cda.repository;

import org.springframework.data.repository.CrudRepository;
import ravi.hobby.project.cda.model.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, Integer> {
}
