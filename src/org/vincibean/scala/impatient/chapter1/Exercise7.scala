package org.vincibean.scala.impatient.chapter1

import BigInt.probablePrime
import scala.util.Random

/**
  * What do you need to import so that you can get a random prime as
  * probablePrime(100, Random), without any qualifiers before probablePrime and Random?
  * As a minimum, BigInt.probablePrime and scala.util.Random.
  *
  * Created by Vincibean on 11/01/16.
  */
object Exercise7 extends App {
  println(probablePrime(100, Random))
}
