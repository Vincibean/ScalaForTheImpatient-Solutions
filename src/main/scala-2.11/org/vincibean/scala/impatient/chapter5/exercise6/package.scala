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

package org.vincibean.scala.impatient.chapter5

/**
  * In the Person class of Section 5.1, “Simple Classes and Parameterless Methods”,
  * on page 51, provide a primary constructor that turns negative ages to 0.
  *
  * Created by Vincibean on 18/01/16.
  */
package object exercise6 extends App {

  val p1: Person = new Person(30)
  println(s"First person's age should be 30; actual: ${p1.age}")
  val p2: Person = new Person(0)
  println(s"Second person's age should be 0; actual: ${p2.age}")
  val p3: Person = new Person(-24)
  println(s"Third person's age should be -24; actual: ${p3.age}")

}