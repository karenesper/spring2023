// Esperanza Macias
// Feb 25 2023

fun main() {
    val baseFee = 10
    val lessThan20Fee = 0.10
    val twentyTo39Fee = 0.08
    val fortyTo59Fee = 0.06
    val sixtyOrMoreFee = 0.04
    
    print("Enter the number of checks written this month: ")
    val numChecks = readLine()?.toIntOrNull() ?: 0
    
    var checkFee = when {
        numChecks < 20 -> numChecks * lessThan20Fee
        numChecks < 40 -> 20 * lessThan20Fee + (numChecks - 20) * twentyTo39Fee
        numChecks < 60 -> 20 * lessThan20Fee + 20 * twentyTo39Fee + (numChecks - 40) * fortyTo59Fee
        else -> 20 * lessThan20Fee + 20 * twentyTo39Fee + 20 * fortyTo59Fee + (numChecks - 60) * sixtyOrMoreFee
    }
    
    val totalFee = baseFee + checkFee
    
    println("Your service fee for this month is: $$totalFee")
}
