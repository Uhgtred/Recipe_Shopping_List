package com.example.recipeShoppingList.application

class ItemListBuilder {
    private val concreteItemImplementation: AbstractItemList

    constructor(concreteItemImplementation: AbstractItemList) {
        this.concreteItemImplementation = concreteItemImplementation
    }

    fun addName(name: String): ItemListBuilder {
        this.concreteItemImplementation.setListName(name)
        return this
    }

    fun build(): AbstractItemList {
        return this.concreteItemImplementation
    }
}
