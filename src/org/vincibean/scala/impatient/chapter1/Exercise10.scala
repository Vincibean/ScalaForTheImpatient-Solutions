package org.vincibean.scala.impatient.chapter1

/**
  * What do the take , drop , takeRight , and dropRight string functions do?
  *
  * What advantage or disadvantage do they have over using substring ?
  *
  * Created by Vincibean on 11/01/16.
  */
object Exercise10 extends App {
  val inputString = "My Input String"
  println("Using String: " + inputString)
  println

  println("Using 'take(2)': " + inputString.take(2))
  println("Takes the first 2 characters of the String.")
  println

  println("Using 'drop(3)': " + inputString.drop(3))
  println("Drops the first 3 characters and returns the rest of the String.")
  println

  println("Using 'takeRight(3)': " + inputString.takeRight(3))
  println("Starting from the right (i.e. the end of the String), takes the first 3 characters of the String. " +
    "In other words, this method takes the last 3 characters of the String.")
  println

  println("Using 'dropRight(3)': " + inputString.dropRight(3))
  println("Starting from the right (i.e. the end of the String), drops the first 3 characters of the String. " +
    "In other words, this method drops the last 3 characters of the String.")
}
