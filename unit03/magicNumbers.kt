// Esperanza Macias
// FEb 25 2023
fun main() {
    print("Enter month (numeric form): ")
    val month = readLine()?.toIntOrNull() ?: return
    print("Enter day: ")
    val day = readLine()?.toIntOrNull() ?: return
    print("Enter two-digit year: ")
    val year = readLine()?.toIntOrNull() ?: return

    val magic = month * day == year

    if (magic) {
        println("The date is magic!")
    } else {
        println("The date is not magic.")
    }
}
