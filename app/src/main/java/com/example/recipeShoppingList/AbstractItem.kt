package com.example.recipeShoppingList

abstract class AbstractItem {
    private var name: String = ""
    private var unit: String = ""

    fun setItemName(name: String){
        this.name = name
    }

    fun getItemName(): String {
        return this.name
    }

    fun setItemUnit(unit: String){
        this.unit = unit
    }

    fun getItemUnit(): String {
        return this.unit
    }
}
