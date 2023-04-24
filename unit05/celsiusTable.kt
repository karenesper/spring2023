fun main() {
  
    println("Fahrenheit\tCelsius")
    
    // Loop through the Fahrenheit temperatures from 0 to 20
    for (fahrenheit in 0..20) {
      
      // Convert the current Fahrenheit temperature to Celsius using the celsius() function
      val celsius = celsius(fahrenheit.toDouble())
        
        println("$fahrenheit\t\t${"%.2f".format(celsius)}")
    }
}
