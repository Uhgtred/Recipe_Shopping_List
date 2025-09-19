package com.example.recipeShoppingList

abstract class AbstractItemList {
    private var itemListName: String = ""
    private var items: MutableList<AbstractItem> = mutableListOf()

    fun addItem(item: AbstractItem) {
        items.add(item)
    }

    fun removeItem(item: AbstractItem) {
        items.remove(item)
    }

    fun getAllItems(): MutableList<AbstractItem> {
        return items
    }

    fun getName(): String {
        return itemListName
    }

    fun setName(name: String) {
        itemListName = name
    }
}
