package manoj.scala.basic

object ForLoopExample {

  def main(args: Array[String]): Unit = {
    printNumbers()
    println("--------------------------------------")
    printNumbersByUntil()
    println("--------------------------------------")
    printEvenNumbers()
    println("--------------------------------------")
    yieldKeywordExample()
    println("--------------------------------------")
    byKeywordExample()
  }

  // print 1 to 5 numbers
  def printNumbers(start: Int = 1, end: Int = 5): Unit = {
    println("Printing number from " + start + " to " + end)
    for (number <- start to end) {
      println("Number: " + number)
    }
  }

  // print 1 to until 5 numbers
  def printNumbersByUntil(start: Int = 1, end: Int = 5): Unit = {
    println("Printing number from " + start + " until " + end)
    for (number <- start until end) {
      println("Number: " + number)
    }
  }

  // print number using the filters
  def printEvenNumbers(start: Int = 1, end: Int = 10): Unit = {
    println("Printing even number from " + start + " to " + end)
    for (number <- start to end if number % 2 == 0) {
      println("Number: " + number)
    }
  }

  // yeild the filter value using for loop
  def yieldKeywordExample(start: Int = 1, end: Int = 10): Unit = {
    val results = for (number <- start to end if number % 2 == 0) yield number
    println("Printing yeild even number from " + start + " to " + end)
    for (number <- results) {
      println("Yield Number: " + number)
    }
  }

  // by keyword Example using for loop
  def byKeywordExample(start: Int = 1, end: Int = 20): Unit = {
    println("Printing numbers with difference 3, from " + start + " to " + end)
    for (number <- start to end by 3) {
      println("By 3 Number: " + number)
    }
  }
}
