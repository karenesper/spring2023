fun main() {
    var number: Int
    do {
        print("Enter a positive nonzero integer: ")
        number = readLine()!!.toInt()
    } while (number <= 0)

    var sum = 0
    for (i in 1..number) {
        sum += i
    }

    println("The sum of all integers from 1 to $number is $sum.")
}