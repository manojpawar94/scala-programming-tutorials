package manoj.scala.funcational

object HigherOrderFunctionExample {

  def main(args: Array[String]): Unit = {
    val number1 = 15
    val number2 = 8

    // calling Anonymous functions
    println(s"Addition [$number1 + $number2] : " + addition(number1, number2))
    println(s"Subtract [$number1 - $number2] : " + subtract(number1, number2))

    // calling high-order function, pass functions as input to another function
    val result = increase(multiplyByTwo(number1))
    println(s"Multiple $number1 by 2 and increment by 1 : $result")

    // calling Scala Currying function
    val result1 = add(number1)(number2)
    println(s"$number1 + $number2 = $result1")
    val addCurry = add(number1) _
    val result3 = addCurry(number2)
    println(s"$number1 + $number2 = $result3")

  }

  // Anonymous functions using lambda expression
  val addition = (number1: Int, number2: Int) => number1 + number2

  // Anonymous functions by using _ underscore wild card
  val subtract = (_: Int) - (_: Int)

  def multiplyByTwo(number: Int): Int = {
    number * 2
  }

  def increase(number: Int): Int = {
    number + 1
  }

  // Scala Currying functions
  def add(number1: Int)(number2: Int): Int = {
    number1 + number2
  }

  // Scala function with variable length Parameter
  def add(numbers : Int*): Int ={
    var result = 0
    for(number <- numbers){
      result += number
    }
    result
  }
}

