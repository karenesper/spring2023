fun calculateRetail(wholesaleCost: Double, markupPercentage: Double): Double {
  
    val markupAmount = wholesaleCost * (markupPercentage / 100)
    return wholesaleCost + markupAmount
}

fun main() {
  
    print("Enter the wholesale cost of the item: ")
    val wholesaleCost = readLine()!!.toDouble()
    
    print("Enter the markup percentage of the item: ")
    val markupPercentage = readLine()!!.toDouble()
    
    val retailPrice = calculateRetail(wholesaleCost, markupPercentage)
    println("The item's retail price is: $retailPrice")
    
}
