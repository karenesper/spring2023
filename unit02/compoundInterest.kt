// Esperanza Macias
// Feb 12 2023

import kotlin.math.pow

fun main() {
    
    // take user input
    print("Enter the principal amount deposited: ")
    
    val principal = readLine()!!.toDouble()

    print("Enter the annual interest rate: ")
    
    val annualRate = readLine()!!.toDouble()

    print("Enter the number of times interest is compounded per year: ")
    
    val compoundPeriods = readLine()!!.toInt()

    print("Enter the number of years: ")
    val years = readLine()!!.toInt()

    // calculate the amount of money in the account after the specified number of years
    val ratePerPeriod = annualRate / compoundPeriods / 100
    
    val periods = compoundPeriods * years
    val amount = principal * (1 + ratePerPeriod).pow(periods)

   
    println("The amount of money in the account after $years years is: $$amount")
}
