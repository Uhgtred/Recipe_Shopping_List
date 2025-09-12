package com.example.recipeShoppingList.domain.shoppingList


import com.example.recipeShoppingList.AbstractItem
import org.junit.Assert.assertEquals
import org.junit.Test

class TestAbstractItem {
    @Test
    fun `test retrieve Name of the item`() {
        val itemName: String = "testItemName"
        val item: AbstractItem = TestItem(itemName)
        val collectedItemName: String = item.itemName
        assertEquals(collectedItemName, itemName)
    }

    @Test
    fun `test retrieve Unit of the item`() {
        val itemName: String = "testItemName"
        val unit: String = "kg"
        val item: AbstractItem = TestItem(itemName, unit)
    }
}

class TestItem(itemName: String): AbstractItem() {
    override val itemName: String = itemName
    val unit: String = unit
}