package com.example.recipeShoppingList.application.stringOperations

class NameNormalizer {
    companion object {
        fun normalize(name: String): String =
            name
                .trim()
                .lowercase()
                .replaceFirstChar { it.uppercase() }
    }
}
