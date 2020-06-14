package manoj.scala.string

object StringInterpolation extends App {
  val pi = 3.14

  // String interpolation using s
  val message1 = s"The value of PI is $pi"
  println(message1)

  // String interpolation using f
  val message2 = f"The value of PI is $pi%2.3f"
  println(message2)

  //String interpolatio using raw
  val message3 = "Scala\tis\ta\tfunctional\tprogramming\tlanguage."
  val message4 = raw"Scala\tis\ta\tfunctional\tprogramming\tlanguage."
  println(message3)
  println(message4)

}
