package com.example.recipeShoppingList.domain.shoppingList

import com.example.recipeShoppingList.AbstractItem
import org.junit.Assert.assertEquals
import org.junit.Test

class TestAbstractItem {
    @Test
    fun `test retrieve Name of the item`() {
        val itemName: String = "testItemName"
        val item: TestItem = TestItem(itemName, "kg")
        val collectedItemName: String = item.publicItemName
        assertEquals(collectedItemName, itemName)
    }

    @Test
    fun `test retrieve Unit of the item`() {
        val itemName: String = "testItemName"
        val unit: String = "kg"
        val item: TestItem = TestItem(itemName, unit)
        assertEquals(item.publicItemUnit, unit)
    }

    @Test
    fun `test change name of item`() {
        val itemName: String = "testItemName"
        val unit: String = "kg"
        val item: TestItem = TestItem(itemName, unit)
        // check if the first name has been applied succesfully
        assertEquals(itemName, item.publicItemName)
        val newItemName: String = "newTestItemName"
        item.changeName(newItemName)
        // check if the name has been changed successfully
        assertEquals(newItemName, item.publicItemName)
    }

    @Test
    fun `test change unit of item`() {
        val itemName: String = "testItemName"
        val itemUnit: String = "kg"
        val item: TestItem = TestItem(itemName, itemUnit)
        // check if the first unit has been applied succesfully
        assertEquals(itemUnit, item.publicItemUnit)
        val newItemUnit: String = "km"
        item.changeUnit(newItemUnit)
        // check if the unit has been changed successfully
        assertEquals(newItemUnit, item.publicItemUnit)
    }
}

class TestItem(
    override var itemName: String,
    override var itemUnit: String,
) : AbstractItem() {
    /*
    This class is faking a ConcreteItem, deriving from AbstractItem for test-purposes only!
     */
    public val publicItemName: String
        get() = itemName
    public val publicItemUnit: String
        get() = itemUnit
}
