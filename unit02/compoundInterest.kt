// Esperanza Macias
// Feb 12 2023

import java.util.Scanner  
fun main(args: Array<String>) {  
    val input = Scanner(System.`in`)  
    println("Enter amount of money ")  
    var P = input.nextInt()  
    println("Enter the interest rate ")
    var R = input.nextInt()
    println("Enter the number of year(s)")
    var T = input.nextInt()
    println("Ente the numer of times the money will be compunded ")
    var N = input.nextInt()
   
    val  A = P.toDouble() * Math.pow((1 + R.toDouble()/100.00),T.toDouble()) - P
    println(A)
   
} 
