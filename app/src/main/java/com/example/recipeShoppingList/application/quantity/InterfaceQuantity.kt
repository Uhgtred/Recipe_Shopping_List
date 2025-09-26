package com.example.recipeShoppingList.application.quantity

interface InterfaceQuantity {
    fun getItemQuantity(): Pair<Int?, Unit?>

    fun setItemQuantity(
        quantity: Int?,
        unit: Unit?,
    )

    fun getItemAmount(): Int?

    fun setItemAmount(amount: Int?)

    fun getItemUnit(): Unit?

    fun setItemUnit(unit: Unit?)
}
