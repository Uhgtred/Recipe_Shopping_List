# Requirements

---
## Table of contents
[Recipe](#recipe)\
[Ingredients](#ingredients)\
[Shopping List](#shopping-list)\
[Goods](#nonfooditem)
[Database](#database)

---
### Recipe

A Recipe needs to contain information about the ingredients for the recipe but also instructions on how to process the ingredients.
The user shall be able to create recipes inside this app and store them together with the ingredients of the specific recipe.
Also, it shall be possible to add a recipe to the shopping-list instead of a single ingredient. Along with that, it would be nice if the 
 number of people that this recipe is meant for can be edited when adding the recipe to the shopping-list.
All recipes shall be stored in a database. There needs to be a possibility to create new recipes and refactor the existing recipes.

---
### Ingredients

An Ingredient has an ID that is exclusive for the ingredient and a string representing the name of the ingredient, which also needs to be exclusive.
The ingredients shall be stored in a database. There needs to be the possibility to add new ingredients and refactor ingredients.

---
### Shopping List

A shopping list contains Ingredients that are to be bought. The ingredients need to be removable from the list.
It shall be possible to add all ingredients of a recipe with a default amount. 
The amount of ingredients shall be adjustable by giving the recipe a number of people that this recipe is meant for. 

---
### NonFoodItem

NonFoodItems are non-edible things that can be added to the shopping list. 
They need to have an id that is exclusive for the good and also a string representing the name of the good, which also needs to be exclusive.

---
### Database

It shall be possible to store the items in a database, so that for each item that has once been created, it is clear which unit it usually has.
Also there could be some thing like "package size" so that the amount that is needed for a receipe can be distinguished from the amount (package) that will be bought in a store.
On a later stage it would also be nice, if the items that anyone using the app once created is also available for any other user (cloud).