package com.example.recipeShoppingList

abstract class AbstractItem {
    protected abstract var itemName: String

    fun changeName(newName: String) {
        // Setter for changing the name of an Item.
        itemName = newName
    }

    protected abstract var itemUnit: String

    fun changeUnit(newUnit: String) {
        // Setter for changing the unit of an Item.
        itemUnit = newUnit
    }
}
