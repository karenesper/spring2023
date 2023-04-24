// Esperanza Macias
// Feb 12 3023 import java.util.Scanner  

fun main() {
    val cookiesPerBag = 40
    val servingsPerBag = 10
    val caloriesPerServing = 300
    
    print("Enter the number of cookies you ate: ")
    val cookiesAte = readLine()!!.toInt()
    
    val servingsAte = cookiesAte.toDouble() / cookiesPerBag * servingsPerBag
    val totalCalories = servingsAte * caloriesPerServing
    
    println("You ate $servingsAte servings, which is a total of $totalCalories calories.")
}

