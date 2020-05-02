package guru.springframework.services;

import guru.springframework.commands.IngredientCommand;

/**
 * m-pawelczyk (GitGub) / m_pawelczyk (Twitter)
 * on 30.04.2020
 * created IngredientService in guru.springframework.services
 * in project spring5-recipe-app
 */
public interface IngredientService {

    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);

    IngredientCommand saveIngredientCommand(IngredientCommand command);

    void deleteById(Long recipeId, Long idToDelete);
}
