import kotlin.random.Random

fun main() {
  
    val responses = arrayOf(
        "Yes, definitely!",
        "No , I don't think so.",
        "It's possible.",
        "I'm not sure.",
        "Ask again later.",
        "My sources say no.",
        "Outlook not so good.",
        "Most likely.",
        "Cannot predict now.",
        "Better not tell you now."
    )
    
    while (true)
  {
        print("Ask the Magic 8 Ball a yes or no question (press Q to quit): ")
        val question = readLine()
        
        if (question?.equals("Q", ignoreCase = true) == true) {
            break
        }
        val response = responses[Random.nextInt(responses.size)]
        println(response)
    }
}
