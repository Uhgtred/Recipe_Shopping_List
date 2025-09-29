package com.example.recipeShoppingList.application.shoppingList

import com.example.recipeShoppingList.application.stringOperations.NameNormalizer

class ShoppingListFactory {
    fun createShoppingList(name: String): ShoppingList {
        val shoppingList = ShoppingList()
        val shoppingListName = NameNormalizer.normalize(name)
        shoppingList.setListName(name)
        return shoppingList
    }
}
