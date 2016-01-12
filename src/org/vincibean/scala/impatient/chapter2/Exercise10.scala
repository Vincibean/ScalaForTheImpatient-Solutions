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

package org.vincibean.scala.impatient.chapter2

/**
  * Write a function that computes x exp n , where n is an integer. Use the following
  * recursive definition:
  * • x exp n = y exp 2 if n is even and positive, where y = x exp (n / 2) .
  * • x exp n = x * x exp (n – 1) if n is odd and positive.
  * • x exp 0 = 1
  * • x exp n = 1 / x exp (–n) if n is negative.
  * Don’t use a return statement.
  *
  * Created by Vincibean on 11/01/16.
  */
object Exercise10 extends App {

  println(s"Recursive Power of 34 exp 0 = ${recursivePower(34, 0)}")    // 1
  println(s"Recursive Power of 3 exp 3 = ${recursivePower(3, 3)}")      // Infinite loop!
  println(s"Recursive Power of 3 exp (-3) = ${recursivePower(3, -3)}")  // Infinite loop!
  println(s"Recursive Power of 3 exp 2 = ${recursivePower(2, 2)}")      // Infinite loop!

  def recursivePower(base: Int, exponent: Int): Int = {
    if (exponent > 0 && exponent % 2 == 0)
      recursivePower(recursivePower(base, exponent / 2), 2)
    else if (exponent > 0 && exponent % 2 == 1)
      base * recursivePower(base, exponent - 1)
    else if (exponent < 0)
      recursivePower(base, -exponent)
    else // i.e. if exponent == 0
      1
  }

}
