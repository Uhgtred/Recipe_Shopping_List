package com.example.recipeShoppingList.domain.shoppingList

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotEquals
import org.junit.Test

class AbstractShoppingListUnitTest {
    @Test
    fun `getListItems should return all items that are available in the shopping-list`() {
        val helperClass = HelperClass()
        val shoppinglistItems: List<String> = helperClass.getListItems()
        assertEquals(listOf("test", "2ndTest", "3rdTest"), shoppinglistItems)
    }

    @Test
    fun `getList from different instances should return different lists`() {
        """
        This test is neede to ensure that the list is not shared between different instances of 
        the same class.
        """.trimIndent()
        val helperClass = HelperClass()
        val otherHelperClass = OtherHelperClass()
        val shoppinglistItems: List<String> = helperClass.getListItems()
        val otherShoppingListItems: List<String> = otherHelperClass.getListItems()
        assertEquals(listOf("test", "2ndTest", "3rdTest"), shoppinglistItems)
        assertEquals(listOf("otherTest", "2ndOtherTest", "3rdOtherTest"), otherShoppingListItems)
        assertNotEquals(shoppinglistItems, otherShoppingListItems)
    }
}

class HelperClass : AbstractItemList() {
    /*
    This class is needed for instancing a concrete implementation of a prototype
    Note:
    There need to be two separate classes for the test since this needs to be
    diffent implementations of the same prototype.
     */
    init {
        addItem("test")
        addItem("2ndTest")
        addItem("3rdTest")
    }
}

class OtherHelperClass : AbstractItemList() {
    /*
    This class is needed for instancing a concrete implementation of a prototype
    Note:
    There need to be two separate classes for the test since this needs to be
    diffent implementations of the same prototype.
     */
    init {
        addItem("otherTest")
        addItem("2ndOtherTest")
        addItem("3rdOtherTest")
    }
}
