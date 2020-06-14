package manoj.scala.basic

object ConditionalExample extends App {
	// check age
	val age: Int = 20

	if (age > 18) {
		println(age + " years is eligible.")
	}

	// check even and odd number
	val number = 23
	if (number % 2 == 0)
		println(number + " is even number")
	else
		println(number + " is odd number")

	// check grade of marks
	val percentage = 45
	if (percentage >= 0 && percentage < 35)
		println("GRADE E")
	else if (percentage >= 35 && percentage < 60)
		println("GRADE D")
	else if (percentage >= 60 && percentage < 70)
		println("GRADE C")
	else if (percentage >= 70 && percentage < 80)
		println("GRADE B")
	else if (percentage >= 80 && percentage < 90)
		println("GRADE A")
	else if (percentage >= 90 && percentage <= 100)
		println("GRADE A+")
	else
		println("Invalid")

	def checkIt(number: Int) = if (number > 0) 1 else -1

	val result = checkIt(number)
	println(result)
}
