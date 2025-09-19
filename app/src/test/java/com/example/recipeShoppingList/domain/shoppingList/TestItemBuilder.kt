package com.example.recipeShoppingList.domain.shoppingList

import com.example.recipeShoppingList.ItemBuilder
import com.example.recipeShoppingList.shoppingList.ShoppingListItem
import junit.framework.TestCase.assertEquals
import org.hamcrest.CoreMatchers.instanceOf
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test

class TestItemBuilder {
    val itemBuilder = ItemBuilder(ShoppingListItem())

    @Test
    fun `test is instance of itemBuilder` () {
        val instance = itemBuilder.addName("test")
        assertThat(instance, instanceOf(ItemBuilder::class.java))
    }


    @Test
    fun `test if the item-name can be set` () {
        val instance = itemBuilder.addName("testName").build()
        assertEquals(instance.getItemName(), "testName")
    }

    @Test
    fun `test if the item-unit can be set` () {
        val instance = itemBuilder.addUnit("testUnit").build()
        assertEquals(instance.getItemUnit(), "testUnit")
    }

    @Test
    fun `test if all can be set at a time and instance is instance of ShoppingListItem` () {
        val instance = itemBuilder.addName("testName1").addUnit("testUnit1").build()
        assertEquals(instance.getItemName(), "testName1")
        assertEquals(instance.getItemUnit(), "testUnit1")
        assertThat(instance, instanceOf(ShoppingListItem::class.java))
    }

}