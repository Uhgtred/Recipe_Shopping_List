package com.example.recipeShoppingList.application.items

import com.example.recipeShoppingList.application.quantity.InterfaceQuantity
import com.example.recipeShoppingList.application.quantity.Unit
import java.util.Optional

class ItemFactory {
//    fun createRecipeItem(name: String): Item = Item(name, quantity)
    companion object ShoppingListFactory {
        fun createShoppingListItem(
            name: String,
            quantity: InterfaceQuantity? = null,
        ): Item = Item(name, quantity)
    }
}
