import kotlin.random.Random

fun main() {
  
    val computerChoice = generateComputerChoice()
    val userChoice = getUserChoice()
    
    println("Computer's choice: $computerChoice")
    println("User's choice: $userChoice")
    
    val result = determineWinner(computerChoice, userChoice)
    
    println("Result: $result")
}

fun generateComputerChoice(): String {
  
    val randomNumber = Random.nextInt(1, 4)
    
    return when (randomNumber) {
        1 -> "rock"
        2 -> "paper"
        else -> "scissors"
    }
}

fun getUserChoice(): String {
  
    println("Choose one: rock, paper, scissors")
    
    var userChoice = readLine()?.toLowerCase()
    
    while (userChoice !in listOf("rock", "paper", "scissors")) {
      
        println("Invalid choice. Please choose again.")
        
        userChoice = readLine()?.toLowerCase()
    }
    
    return userChoice
}

fun determineWinner(computerChoice: String, userChoice: String): String {
  
    return when {
      
        computerChoice == userChoice -> "Tie"
        computerChoice == "rock" && userChoice == "scissors" -> "Computer wins"
        computerChoice == "scissors" && userChoice == "paper" -> "Computer wins"
        computerChoice == "paper" && userChoice == "rock" -> "Computer wins"
        else -> "User wins"
    }
}
