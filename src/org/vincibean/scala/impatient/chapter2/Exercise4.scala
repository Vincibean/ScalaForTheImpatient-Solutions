package org.vincibean.scala.impatient.chapter2

/**
  * Write a Scala equivalent for the Java loop:
  * for (int i = 10; i >= 0; i--) System.out.println(i);
  *
  * Created by Vincibean on 11/01/16.
  */
object Exercise4 extends App {
  println("One simple way: explicitly defining the step as -1")
  for (i <- 10.to(0, -1)) println(i)
  println("Another simple way: reversing the Range")
  for (i <- (1 to 10).reverse) println(i)
}
