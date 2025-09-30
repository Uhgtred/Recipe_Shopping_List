package com.example.recipeShoppingList.application.stringOperations

class ListNameNormalizer : NormalizerInterface {
    companion object {
        fun normalize(name: String): String =
            name
                .trim()
                .lowercase()
                .replaceFirstChar { it.uppercase() }
    }
}
