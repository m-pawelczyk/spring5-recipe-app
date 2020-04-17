package guru.springframework.repositories;

import guru.springframework.model.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * m-pawelczyk (GitGub) / m_pawelczyk (Twitter)
 * on 17.04.2020
 * created RecipeRepository in guru.springframework.repositories
 * in project spring5-recipe-app
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
