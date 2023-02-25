// Esperanza Macias
// Feb 25 2023
fun main() {
    print("Enter a number between 1 and 10: ")
    val number = readLine()?.toIntOrNull()

    if (number != null && number in 1..10) {
        val romanNumerals = arrayOf("", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X")
        println("The Roman numeral equivalent of $number is ${romanNumerals[number]}")
    } else {
        println("Error: Please enter a valid number between 1 and 10")
    }
}
