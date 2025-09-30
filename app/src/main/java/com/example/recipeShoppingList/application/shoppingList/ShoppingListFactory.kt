package com.example.recipeShoppingList.application.shoppingList

class ShoppingListFactory {
    fun createShoppingList(name: String): ShoppingList {
        val shoppingList = ShoppingList()
        shoppingList.setListName(name)
        return shoppingList
    }
}
