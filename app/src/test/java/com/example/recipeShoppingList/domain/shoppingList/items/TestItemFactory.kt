package com.example.recipeShoppingList.domain.shoppingList.items

import com.example.recipeShoppingList.application.items.Item
import com.example.recipeShoppingList.application.items.ItemFactory
import org.junit.Test

class TestItemFactory {
    @Test
    fun `test item factory can create shopping list item`() {
        val shoppingListItem = ItemFactory.createShoppingListItem("testItem")
        assert(shoppingListItem is Item)
    }

//    @Test
//    fun `test item factory can create recipe item`() {
//        val recipeItem = ItemFactory.createRecipeItem("testItem", "testPreparation")
//        assert(recipeItem is Item)
//    }
}
