// Esperanza Macias
// Feb 25 2023

fun main() {
    // Get the person's weight in pounds and height in inches
    print("Enter weight in pounds: ")
    val weight = readLine()!!.toDouble()

    print("Enter height in inches: ")
    val height = readLine()!!.toDouble()

    // Calculate the person's BMI
    val bmi = weight * 703 / (height * height)

    // Display the BMI and weight status
    println("BMI: %.1f".format(bmi))
    when {
        bmi < 18.5 -> println("Underweight")
        bmi <= 25 -> println("Optimal weight")
        else -> println("Overweight")
    }
}
