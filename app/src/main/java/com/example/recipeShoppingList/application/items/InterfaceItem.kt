package com.example.recipeShoppingList.application.items

import com.example.recipeShoppingList.application.quantity.Unit

interface InterfaceItem {
    fun setItemName(itemName: String)

    fun getItemName(): String?

    fun setItemQuantity(itemQuantity: Float)

    fun getItemQuantity(): Float?

    fun setItemUnit(unit: Unit)

    fun getItemUnit(): Unit?

    fun setItemPrice(price: Float)

    fun getItemPrice(): Float?
}
