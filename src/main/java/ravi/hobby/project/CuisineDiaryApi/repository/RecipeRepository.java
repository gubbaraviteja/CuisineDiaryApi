package ravi.hobby.project.CuisineDiaryApi.repository;

import org.springframework.data.repository.CrudRepository;
import ravi.hobby.project.CuisineDiaryApi.model.Recipe;

/**
 * We are using Spring data module for data access layer. For more info, https://docs.spring.io/spring-data/data-commons/docs/2.4.3/reference/html/#reference
 */
public interface RecipeRepository extends CrudRepository<Recipe, Integer> {
}
