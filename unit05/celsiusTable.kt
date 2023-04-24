fun main() {
  
    println("Fahrenheit\tCelsius")
    
    for (fahrenheit in 0..20) {
      
        val celsius = celsius(fahrenheit.toDouble())
        
        println("$fahrenheit\t\t${"%.2f".format(celsius)}")
    }
}
