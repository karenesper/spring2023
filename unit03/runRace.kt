// Esperanza Macias
// Feb 25 2023

fun main() {
    // Initialize empty arrays to store the names and times of the runners
    val names = arrayOf("", "", "")
    val times = arrayOf(0, 0, 0)

    // Prompt the user to enter the name and time of each runner
    for (i in 0 until 3) {
        println("Enter the name of runner ${i+1}: ")
        names[i] = readLine()!!

        println("Enter the time, in minutes, it took runner ${i+1} to finish the race: ")
        times[i] = readLine()!!.toInt()
    }

    // Sort the arrays of names and times in ascending order of times
    val sortedTimes = times.copyOf().sorted()
    val sortedNames = Array(3) { "" }
    for (i in 0 until 3) {
        val index = times.indexOf(sortedTimes[i])
        sortedNames[i] = names[index]
    }

    // Display the names of the runners in the order that they finished
    println("The runners finished in the following order:")
    for (i in 0 until 3) {
        println("${i+1}. ${sortedNames[i]}")
    }
}
