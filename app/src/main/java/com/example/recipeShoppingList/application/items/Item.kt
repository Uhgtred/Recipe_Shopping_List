package com.example.recipeShoppingList.application.items

import com.example.recipeShoppingList.application.quantity.Unit

data class Item(
    var name: String,
    var quantity: Float? = null,
    var unit: Unit? = null,
    var price: Float? = null,
) : InterfaceItem {
    override fun setItemName(itemName: String) {
        // unifying the name of the item
        this.name = itemName.trim().lowercase().replaceFirstChar { it.uppercaseChar() }
    }

    override fun getItemName(): String = this.name

    override fun setItemQuantity(itemQuantity: Float) {
        this.quantity = itemQuantity
    }

    override fun getItemQuantity(): Float? = this.quantity

    override fun setItemUnit(unit: Unit) {
        this.unit = unit
    }

    override fun getItemUnit(): Unit? = this.unit

    override fun setItemPrice(price: Float) {
        this.price = price
    }

    override fun getItemPrice(): Float? = this.price

    init {
        setItemName(name)
    }
}
