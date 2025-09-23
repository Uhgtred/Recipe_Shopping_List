package com.example.recipeShoppingList.application

class Item {
    private var name: String = ""
    private var unit: String? = null

    fun setItemName(itemName: String){
        // unifying the name of the item
        this.name = itemName.trim().lowercase().replaceFirstChar { it.uppercaseChar() }
    }

    fun getItemName(): String {
        return this.name
    }

    fun setItemUnit(itemUnit: String) {
        this.unit = itemUnit.trim()
    }

    fun getItemUnit(): String? {
        return this.unit
    }
}
