fun main() {
    var startingPopulation: Int
    var dailyIncreasePercentage: Double
    var numDays: Int

    do {
        print("Enter the starting population (must be >= 2): ")
        startingPopulation = readLine()!!.toInt()
    } while (startingPopulation < 2)

    do {
        print("Enter the daily increase percentage (must be >= 0): ")
        dailyIncreasePercentage = readLine()!!.toDouble()
    } while (dailyIncreasePercentage < 0)

    do {
        print("Enter the number of days the population will multiply (must be >= 1): ")
        numDays = readLine()!!.toInt()
    } while (numDays < 1)

    var population = startingPopulation.toDouble()
    println("Day 1: Population = $startingPopulation")

    for (day in 2..numDays) {
        population += population * (dailyIncreasePercentage / 100)
        println("Day $day: Population = ${population.toInt()}")
    }
}
