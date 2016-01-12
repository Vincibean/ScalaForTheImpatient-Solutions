/*
 * Copyright (C) 2016  Vincibean <Andre Bessi>
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

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
