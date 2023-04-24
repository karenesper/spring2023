fun calculateProfitOrLoss(ns: Int, pp: Double, pc: Double, sp: Double, sc: Double): Double {
    val profit = (ns * sp - sc) - (ns * pp + pc)
    return profit
}

fun main() {
  
    // get user input
    print("Enter the number of shares: ")
    val ns = readLine()!!.toInt()
    print("Enter the purchase price per share: ")
    val pp = readLine()!!.toDouble()
    print("Enter the purchase commission paid: ")
    val pc = readLine()!!.toDouble()
    print("Enter the sale price per share: ")
    val sp = readLine()!!.toDouble()
    print("Enter the sale commission paid: ")
    val sc = readLine()!!.toDouble()

    // calculate profit or loss
    
    val profit = calculateProfitOrLoss(ns, pp, pc, sp, sc)

    // display the result
    
    if (profit > 0) {
        println("The sale of stock resulted in a profit of $$profit.")
    } else if (profit < 0) {
        println("The sale of stock resulted in a loss of $${-profit}.")
    } else {
        println("The sale of stock resulted in neither profit nor loss.")
    }
}
