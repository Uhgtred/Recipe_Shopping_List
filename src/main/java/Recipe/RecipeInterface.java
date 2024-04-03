package Recipe;
import Ingredients.IngredientInterface;
import java.util.List;

public interface RecipeInterface {
    public void createNewRecipe(String recipeName, List<IngredientInterface> ingredients);
    public void deleteRecipe(String recipeName);
    public String getRecipeInstructions(String recipeName);
    public List<IngredientInterface> getRecipeIngredients(String recipeName);
}
