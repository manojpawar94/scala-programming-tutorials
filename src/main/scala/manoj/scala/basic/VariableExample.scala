package manoj.scala.basic

object VariableExample extends App {
	// declaring the immutable variables
	val immutableVariable = 4
	println("immutableVariable = " + immutableVariable)

	// declaring the mutable variables
	var mutableVariable = 9
	println("Value of mutable variable before reassign is " + mutableVariable)
	mutableVariable = 14
	println("Value of mutable variable after reassign is " + mutableVariable)

	// declaring the variable with data type
	val strVar: String = "Manoj Pawar"
	val chrVar: Char = 'M'
	val intVar: Int = 23
	val floatVar: Float = 23.23f
	val doubleVar: Double = 22324.5332

	println("String variable [ strVar ] = " + strVar)
	println("Char variable [ charVar ] = " + chrVar)
	println("Integer variable [ intVar ] = " + intVar)
	println("Float variable [ floatVar ] = " + floatVar)
	println("Double variable [ doubleVar ] = " + doubleVar)
}
