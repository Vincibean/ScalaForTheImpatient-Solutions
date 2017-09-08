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
 *  along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

/**
  * In Section 13.10, "Zipping", on page 187, the expression (prices zip quantities)
  * map { p => p._1 * p._2 } is a bit inelegant. We can’t do (prices zip quantities) map
  * { _ * _ } because _ * _ is a function with two arguments, and we need a
  * function with one argument that is a tuple. The tupled method of the Function
  * object changes a function with two arguments to one that takes a tuple. Apply
  * tupled to the multiplication function so you can map it over the list of pairs.
  */

val mult: (Double, Int) => Double = (d: Double, i: Int) => d * i

val prices: Seq[Double] = List(5.0, 20.0, 9.95)
val quantities: Seq[Int] = List(10, 2, 1)

println(prices.zip(quantities).map(mult.tupled))