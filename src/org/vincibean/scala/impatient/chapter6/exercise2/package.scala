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

package org.vincibean.scala.impatient.chapter6

/**
  * The preceding problem wasn't very object-oriented. Provide a general super-class
  * UnitConversion and define objects InchesToCentimeters, GallonsToLiters, and
  * MilesToKilometers that extend it.
  *
  * Created by Vincibean on 20/01/16.
  */
package object exercise2 extends App {

  println("--- Interesting Facts ---")
  println(s"2 inches correspond to ${InchesToCentimeters(2)} centimeters.")
  println(s"1 gallon corresponds to ${GallonsToLiters(1)} liters.")
  println(s"3 miles correspond to ${MilesToKilometers(3)} kilometers.")

}
