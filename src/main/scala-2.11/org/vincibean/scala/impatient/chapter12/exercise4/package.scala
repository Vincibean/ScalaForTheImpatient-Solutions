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
  * The previous implementation needed a special case when n < 1. Show how
  * you can avoid this with foldLeft. (Look at the Scaladoc for foldLeft. It's like
  * reduceLeft, except that the first value in the chain of combined values is supplied
  * in the call)
  */
package object exercise4 {

  def factorial(i: Int): Int = (1 to i).foldLeft(1)(_ * _)

}
