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
  * Write a procedure countdown(n: Int) that prints the numbers from n to 0.
  *
  * Created by Vincibean on 11/01/16.
  */
package object exercise5 {

  def countdown(n: Int): Unit = if (n <= 0) {
    println("The input number should be greater than 0!")
  } else {
    n.to(0, -1).foreach(println(_))
  }

}
