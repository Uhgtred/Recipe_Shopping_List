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
        testItem.setItemName(itemNameOne)
        assertEquals(itemNameOne, testItem.getItemName())
    }

    @Test
    fun `test retrieve Unit of the item`() {
        testItem.setItemUnit(itemUnitOne)
        assertEquals(itemUnitOne, testItem.getItemUnit())
    }

    @Test
    fun `test change name of item`() {
        // check if the first name has been applied succesfully
        testItem.setItemName(itemNameOne)
        assertEquals(itemNameOne, testItem.getItemName())
        val newItemName: String = "newTestItemName"
        testItem.setItemName(newItemName)
        // check if the name has been changed successfully
        assertEquals(newItemName, testItem.getItemName())
        assertNotEquals(newItemName, itemNameOne)
    }

    @Test
    fun `test change unit of item`() {
        // check if the first unit has been applied succesfully
        testItem.setItemUnit(itemUnitOne)
        assertEquals(itemUnitOne, testItem.getItemUnit())
        val newItemUnit: String = "km"
        testItem.setItemUnit(newItemUnit)
        // check if the unit has been changed successfully
        assertEquals(newItemUnit, testItem.getItemUnit())
        assertNotEquals(newItemUnit, itemUnitOne)
    }
}
