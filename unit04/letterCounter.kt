//Esperanza Macias
//March 2 2023

fun main() {
    print("Enter a string: ")
    val inputString = readLine()!!

    print("Enter a character: ")
    val inputChar = readLine()!![0]

    val count = inputString.count { it == inputChar }

    println("The character '$inputChar' appears in the string '$inputString' $count times.")
}
