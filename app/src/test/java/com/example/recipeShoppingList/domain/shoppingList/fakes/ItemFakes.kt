package com.example.recipeShoppingList.domain.shoppingList.fakes

import com.example.recipeShoppingList.AbstractItem

class FakeItemOne(): AbstractItem() {
    override var itemName: String = "TestItemOne"
    override var itemUnit: String = "TestUnitOne"
}

class FakeItemTwo(): AbstractItem(){
    override var itemName: String = "TestItemTwo"
    override var itemUnit: String = "TestUnitTwo"
}

class FakeItemThree(): AbstractItem() {
    override var itemName: String = "TestItemThree"
    override var itemUnit: String = "TestUnitThree"

}

class FakeItemFour(): AbstractItem() {
    override var itemName: String = "TestItemFour"
    override var itemUnit: String = "TestUnitFour"
}
