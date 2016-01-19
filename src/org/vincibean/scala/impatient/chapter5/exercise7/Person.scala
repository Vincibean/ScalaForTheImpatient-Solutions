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

package org.vincibean.scala.impatient.chapter5.exercise7

/**
  * Write a class Person with a primary constructor that accepts a string containing
  * a first name, a space, and a last name, such as new Person("Fred Smith"). Supply
  * read-only properties firstName and lastName. Should the primary constructor
  * parameter be a var, a val, or a plain parameter? Why?
  *
  * Created by Vincibean on 18/01/16.
  */
class Person (nameAndLastName: String) {    // Make the primary constructor parameter a plain parameter: we don't want
                                            // getters and setters to be created by the compiler.
  private[this] val names = nameAndLastName.split(" ")

  val name: String = names.head

  val lastName: String = names.last

}
