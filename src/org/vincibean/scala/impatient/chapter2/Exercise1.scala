package org.vincibean.scala.impatient.chapter2

/**
  * The signum of a number is 1 if the number is positive, –1 if it is negative, and
  * 0 if it is zero. Write a function that computes this value.
  *
  * Created by Vincibean on 11/01/16.
  */
object Exercise1 extends App {
  println("Signum of number -23: " + signum(-23))
  println("Signum of number 46: " + signum(46))
  println("Signum of number 0: " + signum(0))

  def signum(value: Int) = {
    if (value > 0)
      1
    else if (value < 0)
      -1
    else
      0
  }

}
