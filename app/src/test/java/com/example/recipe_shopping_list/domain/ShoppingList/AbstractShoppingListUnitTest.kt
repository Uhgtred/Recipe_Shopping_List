package com.example.recipe_shopping_list

import AbstractShoppingList
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class AbstractShoppingListUnitTest {


    @Test
    fun `getListItems should return all items that are available in the shopping-list`() {
        val helperClass = Helper_Class()
        val otherHelperClass = Other_Helper_Class()
        val shoppinglistItems: List<String> = helperClass.getListItems()
        val otherShoppingListItems: List<String> = otherHelperClass.getListItems()
        println(shoppinglistItems)
        assertEquals(listOf("test", "2ndTest", "3rdTest"), shoppinglistItems)
        assertEquals(listOf("otherTest", "2ndOtherTest", "3rdOtherTest"), otherShoppingListItems)
    }
}

class Helper_Class(): AbstractShoppingList(){

    init {
        addItem("test")
        addItem("2ndTest")
        addItem("3rdTest")
    }

}

class Other_Helper_Class: AbstractShoppingList(){

    init{
        addItem("otherTest")
        addItem("2ndOtherTest")
        addItem("3rdOtherTest")
    }

}