package com.example.recipeShoppingList

class ItemBuilder {
    private val concreteItemImplementation: AbstractItem

    constructor(concreteItemImplementation: AbstractItem) {
        this.concreteItemImplementation = concreteItemImplementation
    }

    fun addUnit(unit: String): ItemBuilder {
        concreteItemImplementation.setItemUnit(unit)
        return this
    }

    fun addName(name: String): ItemBuilder {
        concreteItemImplementation.setItemName(name)
        return this
    }

    fun build(): AbstractItem {
        return concreteItemImplementation
    }
}