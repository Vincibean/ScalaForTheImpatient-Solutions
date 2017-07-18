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
 *  along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package org.vincibean.scala.impatient.chapter5.exercise8

/**
  * Make a class Car with read-only properties for manufacturer, model name,
  * and model year, and a read-write property for the license plate. Supply four
  * constructors. All require the manufacturer and model name. Optionally,
  * model year and license plate can also be specified in the constructor. If not,
  * the model year is set to -1 and the license plate to the empty string. Which
  * constructor are you choosing as the primary constructor? Why?
  *
  * Created by Vincibean on 19/01/16.
  */
class Car (val manufacturer: String, val modelName: String, val modelYear: Int = -1, var licensePlate: String = "")
// Nothing else is necessary: this constructor fully satisfies the requirements.