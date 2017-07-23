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

import org.vincibean.scala.impatient.chapter14.exercise10.compose

import scala.math.sqrt

def f(x: Double) = if (x > 0) Some(sqrt(x)) else None
def g(x: Double) = if (x != 1) Some(1 / (x - 1)) else None
val h = compose(f, g)

println(h(2))
println(h(1))
println(h(0))