// The function calculates the distance an object falls during a given time in seconds
fun fallingDistance(time: Double): Double {
  
    val g = 9.8
    val distance = 0.5 * g * time * time
    return distance
  
}

fun main() {
  
    // Loop from 1 to 10 seconds
    for (i in 1..10) {
      
        // Convert loop variable to Double for time parameter
      val time = i.toDouble()
        val distance = fallingDistance(time)
        println("After $time seconds, the object has fallen $distance meters.")
        
    }
}
