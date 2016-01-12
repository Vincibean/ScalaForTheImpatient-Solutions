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

import scala.io.StdIn

/**
  * Write a function product(s : String) that computes the product, as described
  * in the preceding exercises.
  *
  * Created by Vincibean on 11/01/16.
  */
object Exercise8 extends App {

  val string2multiply = StdIn.readLine("Enter the String to 'multiply': ")
  println(s"The result of the multiplication is: ${product(string2multiply)}")

  def product(string2multiply: String) = string2multiply.map(_.toInt).product

}
