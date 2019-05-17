package guru.springframework.services;


import guru.springframework.commands.RecipeCommand;
import guru.springframework.models.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long id);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    RecipeCommand findCommandById(Long valueOf);

    void deleteById(Long id);
}
