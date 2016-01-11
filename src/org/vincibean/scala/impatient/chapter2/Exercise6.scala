package org.vincibean.scala.impatient.chapter2

import scala.io.StdIn

/**
  * Write a for loop for computing the product of the Unicode codes of all letters in a string.
  * For example, the product of the characters in "Hello" is 825152896.
  *
  * Created by Vincibean on 11/01/16.
  */
object Exercise6 extends App {

  val string2multiply = StdIn.readLine("Enter the String to 'multiply': ")
  println(s"The result of the multiplication is: ${stringMultiplication(string2multiply)}")

  def stringMultiplication(string2multiply: String) = {
    var result = 1
    for(char: Char <- string2multiply){
      result *= char
    }
    result
  }

}
