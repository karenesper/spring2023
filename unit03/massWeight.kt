// Esperanza Macias
// Feb 25 2023

fun main() {
    // ask user to input the mass of the object
    print("Enter the mass of the object in kilograms: ")
    val mass = readLine()!!.toDouble()

    // calculate the weight of the object
    val weight = mass * 9.8

    // check if the object is too heavy or too light
    when {
        weight > 1000 -> println("The object is too heavy!")
        weight < 10 -> println("The object is too light!")
        else -> println("The weight of the object is $weight Newtons.")
    }
}
