package org.vincibean.scala.impatient.chapter2

import scala.io.StdIn

/**
  * Make the function of the preceding exercise a recursive function.
  *
  * Created by Vincibean on 11/01/16.
  */
object Exercise9 extends App {

  val string2multiply = StdIn.readLine("Enter the String to 'multiply': ")
  println(s"The result of the multiplication is: ${product(string2multiply)}")

  def product(string2multiply: String): Int = {
    if (string2multiply.length == 0)
      1
    else
      string2multiply.head.toInt * product(string2multiply.tail)
  }

}
