package com.example.recipeShoppingList.domain.shoppingList.fakes

import com.example.recipeShoppingList.AbstractItem
import com.example.recipeShoppingList.AbstractItemList


class FakeItemListOne() : AbstractItemList() {
    /*
    This class is needed for instancing a concrete implementation of a prototype
    Note:
    There need to be two separate classes for the test since this needs to be
    diffent implementations of the same prototype.
     */
    override var items: MutableList<AbstractItem> = mutableListOf(FakeItemOne(), FakeItemTwo())
}

class FakeItemListTwo() : AbstractItemList() {
    /*
    This class is needed for making another instance of a fakelist, which differs from the first
    list. This is needed for making sure that lists are not the same after instancing multiple lists.
     */
    override var items: MutableList<AbstractItem> = mutableListOf(FakeItemThree(), FakeItemFour())
}
