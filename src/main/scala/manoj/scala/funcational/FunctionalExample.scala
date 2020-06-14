package manoj.scala.funcational

object FunctionalExample extends App {
  val number1 = 4
  val number2 = 5
  val addResult: Unit = add(number1, number2)
  println(s"The addition of $number1 and $number2 is $addResult")

  println(s"Is number $number1 even number ?: " + isEven(number1))
  println(s"Is number $number2 even number ?: " + isEven(number2))

  println(s"Is number $number1 prime number ?: " + isPrime(number1))
  println(s"Is number $number2 prime number ?: " + isPrime(number2))

  println(s"The factorial of $number1 is : " + findFactorial(number1))
  println(s"The factorial of $number2 is : " + findFactorial(number2))

  println(s"Multiple without passing values : " + multiply())
  println(s"Multiple by passing 1st variable as $number1 : " + multiply(number1))
  println(s"Multiple by passing 2nd variable as $number2 : " + multiply(number2 = number2))
  println(s"Multiple by passing arguments value in different order : " + multiply(number2 = number2, number1 = number1))

  // example of function without equal to operator [=]
  private def add(number1: Int, number2: Int): Unit = {
    number1 + number2
  }

  // example of function without return statement and with equal to operator [=]
  private def isEven(number: Int): Boolean = {
    var result = false
    if (number % 2 == 0) {
      result = true
    }
    result
  }

  // example of function using return statement
  private def isPrime(number: Int): Boolean = {
    if (number == 1) {
      print("One[1] is  not prime number")
      return false
    }
    for (index <- number - 1 until 1 by -1) {
      if (number % index == 0)
        return false
    }
    true
  }

  // recursive function example for factorial
  private def findFactorial(number: Int): Int = {
    if (number == 1) {
      number
    } else {
      number * findFactorial(number - 1)
    }
  }

  // function with default values
  private def multiply(number1: Int = 1, number2: Int = 1): Int = {
    number1 * number2
  }

}
