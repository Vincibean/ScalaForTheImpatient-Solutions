/*                                                                              //
 * Copyright (C) 2016  Vincibean <Andre Bessi>                                  //
 *                                                                              //
 *  This program is free software: you can redistribute it and/or modify        //
 *  it under the terms of the GNU General Public License as published by        //
 *  the Free Software Foundation, either version 3 of the License, or           //
 *  (at your option) any later version.                                         //
 *                                                                              //
 *  This program is distributed in the hope that it will be useful,             //
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of              //
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the               //
 *  GNU General Public License for more details.                                //
 *                                                                              //
 *  You should have received a copy of the GNU General Public License           //
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.       //
 */                                                                             //

import org.vincibean.scala.impatient.chapter8.exercise6.{Circle, Point, Rectangle}

// Testing the Shape hierarchy
val circle: Circle = new Circle(new Point(3, 3), 3)
println(circle)
println(circle.centerPoint)

val rectangle: Rectangle = new Rectangle(new Point(-4, 2), 4, 8)
println(rectangle)
println(rectangle.centerPoint)