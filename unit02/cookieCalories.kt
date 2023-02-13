// Esperanza Macias
// Feb 12 3023 import java.util.Scanner  

fun main(args: Array<String>) {  
    val read = Scanner(System.`in`)  
    println("Enter number of cookies eaten:")  
    var numOfCookies= read.nextInt()  
    val total = numOfCookies* 75
    println("Your calorie intake was: "+ total)  
}
