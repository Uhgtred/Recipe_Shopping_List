package com.example.recipeShoppingList.domain.shoppingList

abstract class AbstractItemList {
    private val shoppingListItems: MutableList<String> = mutableListOf()

    fun getListItems(): List<String> = shoppingListItems.toList()

    protected fun addItem(item: String) {
        shoppingListItems.add(item)
    }

    protected fun removeItem(item: String) {
        shoppingListItems.remove(item)
    }
}
