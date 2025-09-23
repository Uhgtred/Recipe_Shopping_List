package com.example.recipeShoppingList.domain.shoppingList

import com.example.recipeShoppingList.Item
import com.example.recipeShoppingList.AbstractItemList
import com.example.recipeShoppingList.domain.shoppingList.fakes.FakeItemListOne
import com.example.recipeShoppingList.domain.shoppingList.fakes.FakeItemListTwo
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotEquals
import org.junit.Test

class TestAbstractItemList {
    val testListOne: AbstractItemList = FakeItemListOne()
    val testListTwo: AbstractItemList = FakeItemListTwo()
    var fakeItemOne = Item()
    val fakeItemTwo = Item()

    init {
        fakeItemOne.setItemName("FakeItemOne")
        fakeItemOne.setItemUnit("FakeItemUnitOne")
        fakeItemTwo.setItemName("FakeItemTwo")
        fakeItemTwo.setItemUnit("FakeItemUnitTwo")
    }
    val itemListOne = mutableListOf<Item>(
        fakeItemOne,
        fakeItemTwo
    )

    @Test
    fun `test if possible to add and item to list and get all items from list`() {
        var items = testListOne.getAllItems()
        assertNotEquals(items, itemListOne)
        val expectedResultList = mutableListOf<Item>(fakeItemOne)
        testListOne.addItem(fakeItemOne)
        items = testListOne.getAllItems()
        assertEquals(items, expectedResultList)
    }

    @Test
    fun `test if name of the list can be set and retrieved`() {
        val name = "FakeListOne"
        testListOne.setListName(name)
        assertEquals(
            testListOne.getListName(),
            name.trim().lowercase().replaceFirstChar { it.uppercaseChar() }
        )
    }

    @Test
    fun `test if item can be removed from list`() {
        testListOne.addItem(fakeItemOne)
        var itemsFromList = testListOne.getAllItems()
        assertEquals(itemsFromList[0],fakeItemOne)
        assertEquals(itemsFromList.size, 1)
        testListOne.removeItem(fakeItemOne)
        itemsFromList = testListOne.getAllItems()
        assertEquals(itemsFromList.size, 0)
    }

    @Test
    fun `test if two instances of lists can be read without interference`() {
        testListOne.addItem(fakeItemOne)
        testListTwo.addItem(fakeItemTwo)
        val itemsFromListOne = testListOne.getAllItems()
        assertEquals(
            itemsFromListOne[0],
            fakeItemOne
        )
        val itemFromListTwo = testListTwo.getAllItems()
        assertEquals(
            itemFromListTwo[0],
            fakeItemTwo
        )
        assertEquals(itemsFromListOne.size, 1)
        assertEquals(itemFromListTwo.size, 1)
        assertNotEquals(itemFromListTwo, itemsFromListOne)
    }
}
