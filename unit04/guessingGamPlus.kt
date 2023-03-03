//Esperanza Macias
// Feb 3 2023

import kotlin.random.Random

fun main() 
{
    val numberToGuess = Random.nextInt(1, 101) // Generate random number between 1 and 100
    var guess: Int?
    var guessCount = 0
    do 
  {
        print("Guess a number between 1 and 100: ")
        guess = readLine()?.toIntOrNull()
        
        if (guess == null) {
            println("Invalid input. Please enter a number.")
            
        }
    else if (guess > numberToGuess) {
            println("Too high, try again.")
            guessCount++
        } 
    else if (guess < numberToGuess) {
            println("Too low, try again.")
            guessCount++
        }
    
    } 
  
  while (guess != numberToGuess)
    println("Congratulations, you guessed the number in $guessCount guesses!")
}
