package com.example.recipeShoppingList.domain.shoppingList

import com.example.recipeShoppingList.application.ItemListBuilder
import com.example.recipeShoppingList.application.shoppingList.ShoppingList
import junit.framework.TestCase.assertEquals
import org.hamcrest.CoreMatchers.instanceOf
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test

class TestItemListBuilder {
    val itemListBuilder = ItemListBuilder(ShoppingList())

    @Test
    fun `test if itemlistbuilder can create a list`() {
        val shoppingList = itemListBuilder.build()
        assertThat(shoppingList, instanceOf(ShoppingList::class.java))
    }

    @Test
    fun `test if itemlistbuilder can add a name to an object`() {
        val shoppingList =  itemListBuilder.addName("TestName").build()
        assertEquals("TestName", shoppingList.getListName())
    }
}