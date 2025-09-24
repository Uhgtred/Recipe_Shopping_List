package com.example.recipeShoppingList.application

data class Item(var name: String) {
    private var unit: String? = null

    init {
        setItemName(name)
    }

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
