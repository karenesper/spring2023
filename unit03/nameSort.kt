// Esperanza Macias
// Feb 25 2023

fun main() {
    // create an empty list to store the names
    val names = mutableListOf<String>()

    // ask the user to enter three names
    repeat(3) {
        print("Enter a name: ")
        val name = readLine() ?: ""
        names.add(name)
    }

    // sort the names in ascending order and display them
    names.sort()
    println("Names in ascending order:")
    for (name in names) {
        println(name)
    }
}
