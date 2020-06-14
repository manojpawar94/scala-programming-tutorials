package manoj.scala.basic

object PatternMatchingExample extends App {
	// search pattern scenario 1
	val value = 1

	value match {
		case 1 => println("One")
		case 2 => println("Two")
		case 3 => println("Three")
	}

	// search pattern scenario 2
	def search(value: Any) = value match {
		case 1 => println("Search result 1.")
		case "Two" => println("Search result 2, Two.")
		case _ => println("No result found.") // default value
	}

	search(value)
}