package com.example.recipeShoppingList.application.shoppingList

import com.example.recipeShoppingList.application.items.Item

class ShoppingListController {
    // Must be non-private so reflection in test can read it without making it accessible
    val shoppingLists: MutableList<ShoppingList> = mutableListOf()

    private val shoppingListFactory = ShoppingListFactory()

    fun createShoppingList(listName: String) {
        val shoppingList = shoppingListFactory.createShoppingList(listName)
        shoppingLists.add(shoppingList)
    }

    fun getShoppingList(listName: String): ShoppingList? =
        shoppingLists.find {
            it.getListName() ==
                listName
                    .trim()
                    .lowercase()
                    .replaceFirstChar { it.uppercaseChar() }
        }

    fun addItemToShoppingList(
        listName: String,
        item: Item,
    ) {
        val shoppingList = getShoppingList(listName)
        shoppingList?.addItem(item)
    }
}
