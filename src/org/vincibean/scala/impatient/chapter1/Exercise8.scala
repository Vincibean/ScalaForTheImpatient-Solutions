package org.vincibean.scala.impatient.chapter1

import scala.math.BigInt.probablePrime
import scala.util.Random

/**
  * One way to create random file or directory names is to produce a random
  * BigInt and convert it to base 36, yielding a string such as "qsnvbevtomcj38o06kul".
  * Poke around Scaladoc to find a way of doing this in Scala.
  *
  * Created by Vincibean on 11/01/16.
  */
object Exercise8 extends App {
  // Using probablePrime as in the previous exercise gives Strings that are closer to the example.
  println(probablePrime(100, Random).toString(radix = 36))
}
