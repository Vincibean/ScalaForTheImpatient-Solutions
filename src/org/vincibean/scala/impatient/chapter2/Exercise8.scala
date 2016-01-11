package org.vincibean.scala.impatient.chapter2

import scala.io.StdIn

/**
  * Write a function product(s : String) that computes the product, as described
  * in the preceding exercises.
  *
  * Created by Vincibean on 11/01/16.
  */
object Exercise8 extends App {

  val string2multiply = StdIn.readLine("Enter the String to 'multiply': ")
  println(s"The result of the multiplication is: ${product(string2multiply)}")

  def product(string2multiply: String) = string2multiply.map(_.toInt).product

}
