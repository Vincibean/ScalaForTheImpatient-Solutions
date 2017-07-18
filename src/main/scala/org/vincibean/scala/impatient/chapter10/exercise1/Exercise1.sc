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

import org.vincibean.scala.impatient.chapter10.exercise1.RectangleLike

// Testing the RectangleLike trait
val egg = new java.awt.geom.Ellipse2D.Double(5, 10, 20, 30) with RectangleLike
println(s"Initial egg: [x: ${egg.getX}, y: ${egg.getY}, height: ${egg.getHeight}, width: ${egg.getWidth}]")
egg.translate(10, -10)
egg.grow(10, 20)
println(s"Transformed egg: [x: ${egg.getX}, y: ${egg.getY}, height: ${egg.getHeight}, width: ${egg.getWidth}]")