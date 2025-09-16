package com.example.recipeShoppingList

abstract class AbstractItemList {
    abstract var itemListName: String
    abstract var items: MutableList<AbstractItem>
}
