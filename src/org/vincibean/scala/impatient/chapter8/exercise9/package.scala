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

package org.vincibean.scala.impatient.chapter8

/**
  * In the Creature class of Section 8.10, "Construction Order and Early Definitions",
  * on page 94, replace val range with a def. What happens when you also use a
  * def in the Ant subclass? What happens when you use a val in the subclass?
  * Why?
  *
  * Created by Vincibean on 24/01/16.
  */
package object exercise9 extends App {

  val antVal: AntVal = new AntVal
  val antDef: AntDef = new AntDef
  println(antVal.env.length)    // 0
  println(antDef.env.length)    // 2

  // In the first case (antVal), env has been set to an array of length 0. This is because the range method returns 0,
  // the initial value of all integer fields when an object is allocated. This behaviour doesn't change if range is
  // defined as val because val range is defined after primary constructor call.
  // On the other hand, in the second case (antDef), env has been set to an array of length 2. This is because
  // range is a method (in Creature as well as in AntDef), and as such it's called during primary constructor call
  // and defined before it.

}
