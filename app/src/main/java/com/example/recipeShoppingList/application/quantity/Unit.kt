package com.example.recipeShoppingList.application.quantity

enum class Unit(
    val displayName: String,
    val abbreviation: String,
    val type: UnitType,
) {
    // Weight Units
    GRAM("Gram", "g", UnitType.WEIGHT),
    KILOGRAM("Kilogram", "kg", UnitType.WEIGHT),
    OUNCE("Ounce", "oz", UnitType.WEIGHT),
    POUND("Pound", "lb", UnitType.WEIGHT),

    // Volume Units
    MILLILITER("Milliliter", "ml", UnitType.VOLUME),
    LITER("Liter", "l", UnitType.VOLUME),
    TEASPOON("Teaspoon", "tsp", UnitType.VOLUME),
    TABLESPOON("Tablespoon", "tbsp", UnitType.VOLUME),
    FLUID_OUNCE("Fluid Ounce", "fl oz", UnitType.VOLUME),
    CUP("Cup", "cup", UnitType.VOLUME),
    PINT("Pint", "pt", UnitType.VOLUME),
    QUART("Quart", "qt", UnitType.VOLUME),
    GALLON("Gallon", "gal", UnitType.VOLUME),

    // Count/Piece Units
    PIECE("Piece", "pc", UnitType.COUNT), // Or "pcs" for plural abbreviation
    UNIT("Unit", "unit", UnitType.COUNT),
    DOZEN("Dozen", "dz", UnitType.COUNT),
    ;

    // You can add methods here if needed
    fun isWeightUnit(): Boolean = type == UnitType.WEIGHT

    fun isVolumeUnit(): Boolean = type == UnitType.VOLUME

    companion object {
        // Optional: Helper function to find a unit by its abbreviation or name, ignoring case
        fun fromString(value: String): Unit? {
            val lowerValue = value.lowercase()
            return entries.find {
                it.name.lowercase() == lowerValue ||
                    it.ab;breviation.lowercase() == lowerValue ||
                    it.displayName.lowercase() == lowerValue
            }
        }
    }
}

enum class UnitType {
    WEIGHT,
    VOLUME,
    COUNT,
    OTHER, // For units that don't fit neatly
}
