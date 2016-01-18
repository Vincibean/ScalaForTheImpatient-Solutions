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
  * Reimplement the Time class from the preceding exercise so that the internal
  * representation is the number of minutes since midnight (between 0 and
  * 24 × 60 – 1). Do not change the public interface. That is, client code should be
  * unaffected by your change.
  *
  * Created by Vincibean on 18/01/16.
  */
package object Exercise4 extends App {

  val t1: Time = new Time(12, 12)
  val t2: Time = new Time(12, 13)
  println(s"Is ${t1.hours}:${t1.minutes} before than ${t2.hours}:${t2.minutes}? ${t1.before(t2)}")
  val t3: Time = new Time(25, 67)     // Throws IllegalArgumentException

}