package com.example.recipeShoppingList.application

import java.util.Optional

class ItemFactory {

    fun createRecipeItem(name: String): Item {
        return Item(name)
    }

    fun createShoppingListItem(name: String, quantity: Optional<Quantity>): Item {
        return Item(name, quantity)
    }

}