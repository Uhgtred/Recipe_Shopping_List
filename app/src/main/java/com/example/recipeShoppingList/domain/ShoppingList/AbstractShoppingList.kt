

abstract class AbstractShoppingList{

    private val shoppingListItems: MutableList<String> = mutableListOf()

    fun getListItems(): List<String> {
        return shoppingListItems.toList()
    }

    protected fun addItem(item: String){
        shoppingListItems.add(item)
    }

    protected fun removeItem(item: String){
        shoppingListItems.remove(item)
    }
}