package guru.springframework.services;

import guru.springframework.model.Recipe;

import java.util.Set;

/**
 * m-pawelczyk (GitGub) / m_pawelczyk (Twitter)
 * on 18.04.2020
 * created RecipeService in guru.springframework.services
 * in project spring5-recipe-app
 */
public interface RecipeService {

    Set<Recipe> getRecipes();
}
