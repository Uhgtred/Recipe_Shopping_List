package com.example.recipeShoppingList.domain.shoppingList.quantity

import com.example.recipeShoppingList.application.quantity.Quantity
import com.example.recipeShoppingList.application.quantity.Unit
import org.junit.Test

class TestQuantity {
    @Test
    fun `test setQuantity can set the amount and unit and getQuantity can retrieve it`() {
        val quantity = Quantity()
        quantity.setItemQuantity(2, Unit.KILOGRAM)
        assert(quantity.getItemQuantity().first == 2)
        assert(quantity.getItemQuantity().second?.abbreviation == "kg")
    }

    @Test
    fun `test setAmount can set the amount and getAmount can retrieve it`() {
        val quantity = Quantity()
        quantity.setItemAmount(2)
        assert(quantity.getItemAmount() == 2)
    }

    @Test
    fun `test setUnit can set the unit and getUnit can retrieve it`() {
        val quantity = Quantity()
        quantity.setItemUnit(Unit.KILOGRAM)
        assert(quantity.getItemUnit()?.abbreviation == "kg")
    }

    @Test
    fun `test getQuantity returns null unit if not set`() {
        val quantity = Quantity()
        quantity.setItemAmount(2)
        assert(quantity.getItemQuantity().first == 2)
        assert(quantity.getItemQuantity().second == null)
    }

    @Test
    fun `test getQuantity returns null amount if not set`() {
        val quantity = Quantity()
        quantity.setItemUnit(Unit.KILOGRAM)
        assert(quantity.getItemQuantity().first == null)
        assert(quantity.getItemQuantity().second?.abbreviation == "kg")
    }

    @Test
    fun `test getQuantity returns null amount and unit if not set`() {
        val quantity = Quantity()
        assert(quantity.getItemQuantity().first == null)
        assert(quantity.getItemQuantity().second == null)
    }

    @Test
    fun `test getQuantity returns correct amount and unit if both set`() {
        val quantity = Quantity()
        quantity.setItemQuantity(2, Unit.KILOGRAM)
        assert(quantity.getItemQuantity().first == 2)
        assert(quantity.getItemQuantity().second?.abbreviation == "kg")
    }

    @Test
    fun `test getQuantity returns correct amount and unit if both set separately`() {
        val quantity = Quantity()
        quantity.setItemAmount(2)
        quantity.setItemUnit(Unit.KILOGRAM)
        assert(quantity.getItemQuantity().first == 2)
        assert(quantity.getItemQuantity().second?.abbreviation == "kg")
    }

    @Test
    fun `test getQuantity returns correct amount and unit if both set separately in reverse order`() {
        val quantity = Quantity()
        quantity.setItemUnit(Unit.KILOGRAM)
        quantity.setItemAmount(2)
        assert(quantity.getItemQuantity().first == 2)
        assert(quantity.getItemQuantity().second?.abbreviation == "kg")
    }

    @Test
    fun `test getQuantity returns correct amount and unit if both set separately in reverse order and then set together`() {
        val quantity = Quantity()
        quantity.setItemUnit(Unit.KILOGRAM)
        quantity.setItemAmount(2)
        quantity.setItemQuantity(3, Unit.LITER)
        assert(quantity.getItemQuantity().first == 3)
        assert(quantity.getItemQuantity().second?.abbreviation == "l")
    }
}
