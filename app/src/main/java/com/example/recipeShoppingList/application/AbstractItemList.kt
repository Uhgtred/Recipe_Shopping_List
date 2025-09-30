package com.example.recipeShoppingList.application

import com.example.recipeShoppingList.application.items.Item
import com.example.recipeShoppingList.application.stringOperations.ListNameNormalizer

abstract class AbstractItemList {
    protected var itemListName: String = ""
    protected val items: MutableList<Item> = mutableListOf()

    fun addItem(item: Item) {
        this.items.add(item)
    }

    fun removeItem(item: Item) {
        items.remove(item)
    }

    fun getAllItems(): MutableList<Item> = items

    fun getListName(): String = itemListName

    fun setListName(name: String) {
        itemListName = normalizeListName(name, ListNameNormalizer)
    }

    private fun normalizeListName(
        name: String,
        normalizer: ListNameNormalizer.Companion,
    ): String = normalizer.normalize(name)
}
