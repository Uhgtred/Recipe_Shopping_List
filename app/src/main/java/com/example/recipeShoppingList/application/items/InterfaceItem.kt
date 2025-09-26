package com.example.recipeShoppingList.application.items

import com.example.recipeShoppingList.application.quantity.InterfaceQuantity
import com.example.recipeShoppingList.application.quantity.Unit

interface InterfaceItem {
    fun setItemName(itemName: String)

    fun getItemName(): String?

    fun setItemQuantity(itemQuantity: InterfaceQuantity)

    fun getItemQuantity(): InterfaceQuantity?
}
