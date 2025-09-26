package com.example.recipeShoppingList.application.items

import com.example.recipeShoppingList.application.quantity.InterfaceQuantity

data class Item(
    var name: String,
    var quantity: InterfaceQuantity? = null,
) : InterfaceItem {
    override fun setItemName(itemName: String) {
        // unifying the name of the item
        this.name = itemName.trim().lowercase().replaceFirstChar { it.uppercaseChar() }
    }

    override fun getItemName(): String = this.name

    override fun setItemQuantity(itemQuantity: InterfaceQuantity) {
        this.quantity = itemQuantity
    }

    override fun getItemQuantity(): InterfaceQuantity? = this.quantity

    init {
        setItemName(name)
    }
}
