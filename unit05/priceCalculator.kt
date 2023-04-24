fun calculateRetail(wholesaleCost: Double, markupPercentage: Double): Double {
  
    val markupAmount = wholesaleCost * (markupPercentage / 100)
    // The retail price is calculated by adding the markup amount to the wholesale cost
    
    return wholesaleCost + markupAmount
    return wholesaleCost + markupAmount
}

fun main() {
  
    print("Enter the wholesale cost of the item: ")
    val wholesaleCost = readLine()!!.toDouble()
    
    print("Enter the markup percentage of the item: ")
    val markupPercentage = readLine()!!.toDouble()
    
    // Calls the calculateRetail function with the wholesale cost and markup percentage as arguments and stores the result in the retailPrice variable
    
    val retailPrice = calculateRetail(wholesaleCost, markupPercentage)
    println("The item's retail price is: $retailPrice")
    
}
