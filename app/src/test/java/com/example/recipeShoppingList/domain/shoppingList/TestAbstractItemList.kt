package com.example.recipeShoppingList.domain.shoppingList

import com.example.recipeShoppingList.AbstractItem
import com.example.recipeShoppingList.AbstractItemList
import com.example.recipeShoppingList.domain.shoppingList.fakes.FakeItemListOne
import com.example.recipeShoppingList.domain.shoppingList.fakes.FakeItemListTwo
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotEquals
import org.junit.Test

class TestAbstractItemList {
    val testListOne: AbstractItemList = FakeItemListOne()
    val testListTwo: AbstractItemList = FakeItemListTwo()
    val shoppingListItemsOne: MutableList<AbstractItem> = testListOne.items
    val itemNames: MutableList<String> = mutableListOf<String>("TestItemOne", "TestItemTwo")
    val itemNamesFromFakeListOne = shoppingListItemsOne.map { it.itemName }

    @Test
    fun `List name can be retrieved from the list instance`() {
        assertEquals(testListOne.itemListName, "FakeItemListOne")
    }

    @Test
    fun `getListItems should return all items that are available in the shopping-list`() {
        // Checking if the names read from the list match the names created in the beginning of the
        // Test-class.
        assertEquals(itemNames, itemNamesFromFakeListOne)
    }

    @Test
    fun `getListItems of two instances of lists should return different results`() {
        // Checking if the names read from the list match the names created in the beginning of the
        // Test-class.
        assertEquals(itemNames, itemNamesFromFakeListOne)
        // Creating a list with items from another fake-list.
        val shoppinglistItemsTwo: MutableList<AbstractItem> = testListTwo.items
        val itemNamesTwo = mutableListOf<String>("TestItemThree", "TestItemFour")
        // Extracting the names of items in the list that has been created beforhand.
        val itemNamesFromFakeItemListTwo = shoppinglistItemsTwo.map { it.itemName }
        // Check whether the names in the list match the expected names.
        assertEquals(itemNamesTwo, itemNamesFromFakeItemListTwo)
        // Check whether the names in list one differ from the names in list two.
        assertNotEquals(itemNamesFromFakeItemListTwo, itemNamesFromFakeListOne)
    }
}
