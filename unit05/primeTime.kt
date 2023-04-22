fun isNumberDivisible(number: Int, divisor: Int): Boolean {
    return number % divisor == 0
  // function isNumberDivisible is taking integers number and divisor and checking if their divisible using the operator %
}

fun isPrime(number: Int): Boolean {
    if (number < 2) {
        return false
      
     // check wether number is less than two.. it is false if number is less than 2
      
    }
    for (i in 2..Math.sqrt(number.toDouble()).toInt()) {
        if (isNumberDivisible(number, i)) {
            return false
          
        }
    }
    return true
}
