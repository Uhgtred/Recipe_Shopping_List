package ShoppingList;

import Goods.GoodsInterface;
import Ingredients.IngredientInterface;
import Recipe.RecipeInterface;

public interface ShoppingListInterface {
    public void addItem(IngredientInterface item);
    public void addItem(GoodsInterface item);
    public void removeItem(IngredientInterface item);
    public void addRecipe(RecipeInterface recipe);
    public void removeRecipe(RecipeInterface recipe);
}
