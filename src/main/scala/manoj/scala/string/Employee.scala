package manoj.scala.string

class Employee(firstName : String, lastName : String, yearOfExp : Double) {

  def showDetails(): String ={
    return "{FirstName: " + firstName + ", LastName: " + lastName + ", YearOfExperince: " + yearOfExp + "}"
  }

}
