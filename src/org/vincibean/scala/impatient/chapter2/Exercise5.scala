package org.vincibean.scala.impatient.chapter2

import scala.io.StdIn

/**
  * Write a procedure countdown(n: Int) that prints the numbers from n to 0.
  *
  * Created by Vincibean on 11/01/16.
  */
object Exercise5 extends App {

  print("Select an integer number > 0: ")
  val start = StdIn.readInt()
  // TODO Check that start > 0
  println
  println("Starting countdown")
  countdown(start)
  println("BOOOOM!!")

  // TODO Check that n > 0
  def countdown(n: Int) = n.to(0, -1).foreach(println(_))

}
