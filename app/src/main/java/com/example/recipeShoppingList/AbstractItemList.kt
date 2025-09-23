package com.example.recipeShoppingList

abstract class AbstractItemList {
    protected var itemListName: String = ""
    protected var items: MutableList<Item> = mutableListOf()

    fun addItem(item: Item) {
        this.items.add(item)
    }

    fun removeItem(item: Item) {
        items.remove(item)
    }

    fun getAllItems(): MutableList<Item> {
        return items
    }

    fun getListName(): String {
        return itemListName
    }

    fun setListName(name: String) {
        itemListName = name.trim().lowercase().replaceFirstChar { it.uppercaseChar() }
    }
}
