package manoj.scala.basic

object WhileLoopExample {

	def main(args: Array[String]): Unit = {
		// while loop example
		printEvenNumber(5, 13)

		println("--------------------------------------")

		// do-while loop example
		printNumber()
	}

	// print even number for range
	def printEvenNumber(start: Int = 0, end: Int = 0): Unit = {
		var startIndex = if (start % 2 == 0) start else start + 1
		while (startIndex < end) {
			println(startIndex)
			startIndex += 2
		}
	}

	def printNumber(): Unit = {
		var number = 0
		do {
			println(number)
			number += 3
		} while (number <= 20)
	}
}
