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
  * Define an abstract class Shape with an abstract method centerPoint and subclasses
  * Rectangle and Circle. Provide appropriate constructors for the subclasses and
  * override the centerPoint method in each subclass.
  *
  * Created by Vincibean on 24/01/16.
  */
package object exercise6 extends App {

  val circle: Circle = Circle(Point(3, 3), 3)
  println(circle)
  println(circle.centerPoint)

  val rectangle: Rectangle = Rectangle(Point(-4, 2), 4, 8)
  println(rectangle)
  println(rectangle.centerPoint)

}
