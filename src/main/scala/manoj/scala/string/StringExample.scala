package manoj.scala.string

object StringExample extends App {
  //string is immutable in Scala like java.
  var firstName = "Manoj"
  var lastName = "Pawar"
  var tempName = "Manoj"

  val employee = new Employee(firstName, lastName, 4.1)
  println(employee.showDetails())

  // string comparison example - false scenario
  if (firstName == lastName) {
    println(firstName + " and " + lastName + " are equal.")
  } else {
    println(firstName + " and " + lastName + " are not equal.")
  }

  // string comparison example - true scenario
  if (firstName == tempName) {
    println(firstName + " and " + tempName + " are equal")
  } else {
    println(firstName + " and " + tempName + " are not equal.")
  }

  // compareTo method
  println("FirstName[" + firstName + "] compare to LastName[" + lastName + "]: " + firstName.compareTo(lastName))
  println("FirstName[" + firstName + "] compare to TempName [" + tempName + "]: " + firstName.compareTo(tempName))
  println("LastName[" + lastName + "] compare to TempName[" + tempName + "]: " + lastName.compareTo(tempName))

}
