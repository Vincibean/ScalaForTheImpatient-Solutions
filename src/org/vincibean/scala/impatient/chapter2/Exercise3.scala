package org.vincibean.scala.impatient.chapter2

/**
  * Come up with one situation where the assignment x = y = 1 is valid in Scala.
  * (Hint: Pick a suitable type for x .)
  *
  * Created by Vincibean on 11/01/16.
  */
object Exercise3 extends App {
  var x = ()
  var y = 0
  x = y = 1
  println("Value of x: " + x)
  println("Value of y: " + y)
}
