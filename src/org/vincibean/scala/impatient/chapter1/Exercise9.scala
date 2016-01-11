package org.vincibean.scala.impatient.chapter1

import scala.math.BigInt._
import scala.util.Random

/**
  * How do you get the first character of a string in Scala? The last character?
  *
  * Created by Vincibean on 11/01/16.
  */
object Exercise9 extends App {
  // Taking the solution of the previous exercise in order to have a randomly generated String.
  val inputString = probablePrime(100, Random).toString(radix = 36)
  println("Taking as input the String " + inputString)
  println("Its first character is: " + inputString.head)
  println("Its last character is: " + inputString.last)
}
