package com.example.recipeShoppingList.domain.shoppingList

import com.example.recipeShoppingList.ItemListBuilder
import com.example.recipeShoppingList.shoppingList.ShoppingList
import org.junit.Test

class TestItemListBuilder {
    val itemListBuilder = ItemListBuilder(ShoppingList())

    @Test
    fun `test if itemlistbuilder can create a list`() {
        itemListBuilder.build()
    }
}