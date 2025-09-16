package com.example.recipeShoppingList.domain.shoppingList

import com.example.recipeShoppingList.AbstractItem
import com.example.recipeShoppingList.AbstractItemList
import com.example.recipeShoppingList.domain.shoppingList.fakes.FakeItemListOne
import com.example.recipeShoppingList.domain.shoppingList.fakes.FakeItemListTwo
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotEquals
import org.junit.Test

class TestAbstractShoppingListUnit {
    @Test
    fun `getListItems should return all items that are available in the shopping-list`() {
        val testListOne: AbstractItemList = FakeItemListOne()
        val shoppinglistItems: MutableList<AbstractItem> = testListOne.items
        val itemNames = mutableListOf<String>("TestItemOne", "TestItemTwo")
        val itemNamesFromFakeList =  shoppinglistItems.map { it.itemName }
        assertEquals(itemNames, itemNamesFromFakeList)
    }

    @Test
    fun `getListItems of two instances of lists should return different results` () {
        val testListOne: AbstractItemList = FakeItemListOne()
        val testListTwo: AbstractItemList = FakeItemListTwo()
        val shoppinglistItemsOne: MutableList<AbstractItem> = testListOne.items
        val itemNames = mutableListOf<String>("TestItemOne", "TestItemTwo")
        val itemNamesFromFakeListOne =  shoppinglistItemsOne.map { it.itemName }
        assertEquals(itemNames, itemNamesFromFakeListOne)
        val shoppinglistItemsTwo: MutableList<AbstractItem> = testListTwo.items
        val itemNamesTwo = mutableListOf<String>("TestItemThree", "TestItemFour")
        val itemNamesFromFakeItemListTwo = shoppinglistItemsTwo.map { it.itemName }
        assertEquals(itemNamesTwo, itemNamesFromFakeItemListTwo)
        assertNotEquals(itemNamesFromFakeItemListTwo, itemNamesFromFakeListOne)
    }
}
