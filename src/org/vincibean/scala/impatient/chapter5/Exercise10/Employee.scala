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

package org.vincibean.scala.impatient.chapter5.Exercise10

/**
  * Consider the class:
  *
  *   class Employee(val name: String, var salary: Double) {
  *     def this() { this("John Q. Public", 0.0) }
  *    }
  *
  * Rewrite it to use explicit fields and a default primary constructor. Which form
  * do you prefer? Why?
  *
  * Created by Vincibean on 19/01/16.
  */
class Employee (val name: String = "John Q. Public", var salary: Double = 0.0)
// This is my preferred form: it is more concise, less cluttered, and centers all constructor information in one place.
