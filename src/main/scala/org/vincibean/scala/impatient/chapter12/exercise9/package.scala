/*
 * Copyright (C) 2017  Vincibean <Andrea Bessi>
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

package org.vincibean.scala.impatient.chapter12

/**
  * Implement corresponds without currying. Then try the call from the preceding
  * exercise. What problem do you encounter?
  */
package object exercise9 {

  // In order to make everything work smoothly, we need to define the types ourselves.
  // In this case it's not a big deal, since this method won't be used elsewhere.
  def corresponds(ss: Array[String], is: Array[Int], f: (String, Int) => Boolean): Boolean = if (ss.length != is.length) {
    false
  } else {
    ss.zip(is).map(t => f.tupled(t)).forall(x => x)
  }


}
