package ShoppingList;

import Ingredients.IngredientInterface;
import Recipe.RecipeInterface;

public interface ShoppingListInterface {
    void addItem(IngredientInterface item);
    void removeItem(IngredientInterface item);
    void addRecipe(RecipeInterface recipe);
    void removeRecipe(RecipeInterface recipe);
}
