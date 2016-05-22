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
  * The signum of a number is 1 if the number is positive, –1 if it is negative, and
  * 0 if it is zero. Write a function that computes this value.
  *
  * Created by Vincibean on 11/01/16.
  */
package object exercise1 extends App {

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
