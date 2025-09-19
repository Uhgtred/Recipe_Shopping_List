package com.example.recipeShoppingList

class ItemListBuilder {
    private val concreteItemImplementation: AbstractItemList

    constructor(concreteItemImplementation: AbstractItemList) {
        this.concreteItemImplementation = concreteItemImplementation
    }

    fun addName(name: String){

    }

    fun build() {
        return
    }
}