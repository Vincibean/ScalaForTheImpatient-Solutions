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

package org.vincibean.scala.impatient.chapter7.exercise3

/**
  * Write a package random with functions nextInt(): Int , nextDouble(): Double , and
  * setSeed(seed: Int): Unit . To generate random numbers, use the linear
  * congruential generator
  *
  *   next = previous × a + b mod 2 exp n,
  *
  * where a = 1664525, b = 1013904223, and n = 32.
  *
  * Created by Vincibean on 22/01/16.
  */
package object exercise3 extends App {

  val seed = 131
  println(s"Setting seed to $seed")
  random.setSeed(seed)
  println(s"A random Double: ${random.nextDouble()}")
  println(s"A random Int: ${random.nextInt()}")
  println(s"Another random Int (see the difference!): ${random.nextInt()}")

}
