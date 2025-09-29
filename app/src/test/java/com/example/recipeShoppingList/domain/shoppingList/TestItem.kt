package com.example.recipeShoppingList.domain.shoppingList

import com.example.recipeShoppingList.application.items.ItemFactory
import com.example.recipeShoppingList.application.quantity.Unit
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotEquals
import org.junit.Test

class TestItem {
    val itemNameOne = "TestItemOne"
    val itemUnitOne = Unit.GRAM
    var testItem = ItemFactory.createShoppingListItem(itemNameOne)

    @Test
    fun `test retrieve Name of the item`() {
        testItem.setItemName(itemNameOne)
        assertEquals(
            itemNameOne.trim().lowercase().replaceFirstChar { it.uppercaseChar() },
            testItem.getItemName(),
        )
    }

    @Test
    fun `test retrieve Unit of the item`() {
        testItem.quantity?.setItemUnit(itemUnitOne)
        assertEquals(itemUnitOne, testItem.quantity?.getItemUnit())
    }

    @Test
    fun `test change name of item`() {
        // check if the first name has been applied successfully
        testItem.setItemName(itemNameOne)
        assertEquals(
            itemNameOne.trim().lowercase().replaceFirstChar { it.uppercaseChar() },
            testItem.getItemName(),
        )
        val newItemName: String = "newTestItemName"
        testItem.setItemName(newItemName)
        // check if the name has been changed successfully
        assertEquals(
            newItemName.trim().lowercase().replaceFirstChar { it.uppercaseChar() },
            testItem.getItemName(),
        )
        assertNotEquals(newItemName, itemNameOne)
    }

    @Test
    fun `test change unit of item`() {
        // check if the first unit has been applied successfully
        testItem.quantity?.setItemUnit(itemUnitOne)
        assertEquals(itemUnitOne, testItem.quantity?.getItemUnit())
        val newItemUnit: Unit = Unit.KILOGRAM
        testItem.quantity?.setItemUnit(newItemUnit)
        // check if the unit has been changed successfully
        assertEquals(newItemUnit, testItem.quantity?.getItemUnit())
        assertNotEquals(newItemUnit, itemUnitOne)
    }
}
