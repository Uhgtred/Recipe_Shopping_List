package com.example.recipeShoppingList.domain.shoppingList.shoppingList

import com.example.recipeShoppingList.application.items.ItemFactory
import com.example.recipeShoppingList.application.shoppingList.ShoppingList
import com.example.recipeShoppingList.application.shoppingList.ShoppingListController
import com.example.recipeShoppingList.application.stringOperations.ListNameNormalizer
import junit.framework.TestCase.assertNotNull
import org.junit.Assert.assertEquals
import org.junit.Test
import kotlin.reflect.KClass
import kotlin.reflect.KProperty1
import kotlin.reflect.full.declaredMemberProperties

class TestShoppingListController {
    @Test
    fun testCreateShoppingList() {
        // Create an instance of ShoppingListController
        val controller = ShoppingListController()
        val listName = "Test List"
        val kClass: KClass<ShoppingListController> = ShoppingListController::class
        // Call the createShoppingList method and store a list inside the shoppinglistcontroller
        controller.createShoppingList(listName)
        val itemsPropertyRef =
            kClass.declaredMemberProperties.find { it.name == "shoppingLists" }
                as? KProperty1<ShoppingListController, *>
        assertNotNull(itemsPropertyRef)
        // testing if a shoppingList is in the shoppingLists
        val privateListValue = itemsPropertyRef?.get(controller) as? List<String>
        assert(!privateListValue!!.isEmpty())
    }

    @Test
    fun testAddItemToShoppingList() {
        // Create an instance of ShoppingListController
        val controller = ShoppingListController()
        val listName = "Test List"
        val itemName = "Test Item"
        val testItem = ItemFactory.createShoppingListItem(itemName)
        // Call the createShoppingList method and store a list inside the shoppinglistcontroller
        controller.createShoppingList(listName)
        // Call the addItemToShoppingList method and store an item inside the shoppinglist
        controller.addItemToShoppingList(listName, testItem)
        val createdList: ShoppingList? = controller.getShoppingList(listName)
        assertEquals(
            ListNameNormalizer.normalize(listName),
            createdList?.getListName(),
        )
        assertEquals(
            testItem,
            createdList?.getAllItems()?.first(),
        )
    }

    @Test
    fun testRemoveItemFromShoppingList() {
        // Create an instance of ShoppingListController
        val controller = ShoppingListController()
        val listName = "Test List"
        val itemName = "Test Item"
        val testItem = ItemFactory.createShoppingListItem(itemName)
        // Call the createShoppingList method and store a list inside the shoppinglistcontroller
        controller.createShoppingList(listName)
        controller.addItemToShoppingList(listName, testItem)
        val retrievedItem = controller.getShoppingList(listName)?.getAllItems()?.first()
        assertEquals(testItem, retrievedItem)
        controller.removeItemFromShoppingList(listName, testItem)
        val retrievedItemAfterRemoval = controller.getShoppingList(listName)?.getAllItems()?.firstOrNull()
        assertEquals(null, retrievedItemAfterRemoval)
    }
}
