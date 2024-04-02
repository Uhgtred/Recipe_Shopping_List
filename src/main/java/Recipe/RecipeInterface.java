package Recipe;
import Ingredients.IngredientInterface;
import java.util.List;

public interface RecipeInterface {
    void createNewRecipe(String recipeName, List<IngredientInterface> ingredients);
    void deleteRecipe(String recipeName);
    String getRecipeInstructions(String recipeName);
    List<IngredientInterface> getRecipeIngredients(String recipeName);
}
