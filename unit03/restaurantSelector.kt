// Esperanza Macias
// Feb 25 2023

fun main() {
    // Restaurant choices with dietary restrictions
    val restaurants = mapOf(
        "Joe's Gourmet Burgers" to listOf(false, false, false),
        "Main Street Pizza Company" to listOf(true, false, true),
        "Corner Cafe" to listOf(true, true, true),
        "Mama's Fine Italian" to listOf(true, false, false),
        "The Chef's Kitchen" to listOf(true, true, true)
    )

    // Ask about dietary restrictions
    print("Is anyone in your party a vegetarian? ")
    val isVegetarian = readYesNo()
    print("Is anyone in your party a vegan? ")
    val isVegan = readYesNo()
    print("Is anyone in your party gluten-free? ")
    val isGlutenFree = readYesNo()

    // Find matching restaurants
    val matchingRestaurants = restaurants.filter { (_, restrictions) ->
        (!isVegetarian || restrictions[0]) && (!isVegan || restrictions[1]) && (!isGlutenFree || restrictions[2])
    }.keys

    // Print the matching restaurants
    println("\nHere are your restaurant choices:")
    for (restaurant in matchingRestaurants) {
        println(restaurant)
    }
}

fun readYesNo(): Boolean {
    val input = readLine()?.toLowerCase()
    return input == "yes" || input == "y"
}
