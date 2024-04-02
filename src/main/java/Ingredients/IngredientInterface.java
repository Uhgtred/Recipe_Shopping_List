package Ingredients;

public interface IngredientInterface {
    Object getIngredient(String item);
    void deleteIngredient(String item);
    void createNewIngredient(String item);
}
