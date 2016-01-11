package org.vincibean.scala.impatient.chapter2

import scala.io.StdIn

/**
  * Solve the preceding exercise without writing a loop.
  * (Hint: Look at the StringOps Scaladoc.)
  *
  * Created by Vincibean on 11/01/16.
  */
object Exercise7 extends App {

  val string2multiply = StdIn.readLine("Enter the String to 'multiply': ")
  println(s"The result of the multiplication is: ${string2multiply.map(_.toInt).product}")

}
