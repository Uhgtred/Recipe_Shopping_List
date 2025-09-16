package com.example.recipeShoppingList.domain.shoppingList

import com.example.recipeShoppingList.domain.shoppingList.fakes.FakeItemOne
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotEquals
import org.junit.Test

class TestAbstractItem {
    var testItem = FakeItemOne()
    val itemNameOne = "TestItemOne"
    val itemUnitOne = "TestUnitOne"

    @Test
    fun `test retrieve Name of the item`() {
        assertEquals(itemNameOne, testItem.itemName)
    }

    @Test
    fun `test retrieve Unit of the item`() {
        assertEquals(itemUnitOne, testItem.itemUnit)
    }

    @Test
    fun `test change name of item`() {
        // check if the first name has been applied succesfully
        assertEquals(itemNameOne, testItem.itemName)
        val newItemName: String = "newTestItemName"
        testItem.itemName = newItemName
        // check if the name has been changed successfully
        assertEquals(newItemName, testItem.itemName)
        assertNotEquals(newItemName, itemNameOne)
    }

    @Test
    fun `test change unit of item`() {
        // check if the first unit has been applied succesfully
        assertEquals(itemUnitOne, testItem.itemUnit)
        val newItemUnit: String = "km"
        testItem.itemUnit = newItemUnit
        // check if the unit has been changed successfully
        assertEquals(newItemUnit, testItem.itemUnit)
        assertNotEquals(newItemUnit, itemUnitOne)
    }
}
