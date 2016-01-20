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

package org.vincibean.scala.impatient.chapter6

/**
  * Define an Origin object that extends java.awt.Point. Why is this not actually a
  * good idea? (Have a close look at the methods of the Point class.)
  *
  * Created by Vincibean on 20/01/16.
  */
package object exercise3 extends App {

  /*
   * java.awt.Point is a mutable object (and not a good one, I'd dare to say, since instead of setters
   * it lets manipulate its internal state, i.e. fields x and y are public, thus potentially breaking encapsulation);
   * this is in contrast with the general definition of a Singleton, which should store shared data (and, possibly,
   * not let others manipulate them).
   * Finally, and more importantly, an "origin" point is supposed to be fixed and never change position. Imagine what
   * would happen if, all of a sudden, your origin changed! It would leave you the impression that ALL points changed,
   * thus potentially breaking your calculations.
   *
   * You can find a good answer to this question here: http://stackoverflow.com/a/21605986
   */

  println(s"Origin: time 0: $Origin")
  Origin.x = 1
  println(s"Origin: time 1: $Origin")
  println(s"Origin: time 1: ${Origin.getX}")
  Origin.setLocation(23, 34)
  val point = Origin.getLocation
  println(s"Origin: time 2: $Origin")
  Origin.move(-12, -7)
  println(s"Origin: time 3: $Origin")
  println(s"Origin: distance from the previous location: ${Origin.distance(point)}")

}
