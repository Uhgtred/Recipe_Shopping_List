package com.example.recipeShoppingList.application.quantity

class Quantity : InterfaceQuantity {
    private var amount: Int? = null
    private var unit: Unit? = null

    override fun getItemQuantity(): Pair<Int?, Unit?> = Pair(amount, unit)

    override fun setItemQuantity(
        quantity: Int?,
        unit: Unit?,
    ) {
        this.amount = quantity
        this.unit = unit
    }

    override fun getItemAmount(): Int? = amount

    override fun setItemAmount(amount: Int?) {
        this.amount = amount
    }

    override fun getItemUnit(): Unit? = unit

    override fun setItemUnit(unit: Unit?) {
        this.unit = unit
    }
}
