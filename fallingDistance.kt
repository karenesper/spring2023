fun fallingDistance(time: Double): Double {
  
    val g = 9.8
    val distance = 0.5 * g * time * time
    return distance
  
}

fun main() {
  
    for (i in 1..10) {
      
        val time = i.toDouble()
        val distance = fallingDistance(time)
        println("After $time seconds, the object has fallen $distance meters.")
        
    }
}
