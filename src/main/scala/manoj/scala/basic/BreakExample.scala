package manoj.scala.basic

import scala.util.control.Breaks._

object BreakExample extends App {
  // example 1: use of break statement
  breakable {
    for (index <- 0 to 10) {
      if (index == 7)
        break
      println("Index: " + index)
    }
  }

  //example 2: use of break statementin inner loop
  for(outerIndex <- 1 until 10){
    breakable(
      for (innnerIndex <- 1 to 5){
        if(outerIndex == innnerIndex)
          break
        println("[][] = {" + outerIndex + ", " + innnerIndex + "}")
      }
    )
  }
}
