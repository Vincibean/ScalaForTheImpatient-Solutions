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

package org.vincibean.scala.impatient.chapter9.exercise10

import scala.collection.mutable.ArrayBuffer

/**
  * Expand the example in Section 9.8, “Serialization,” on page 113. Construct a
  * few Person objects, make some of them friends of another, and save an
  * Array[Person] to a file. Read the array back in and verify that the friend relations
  * are intact.
  */
@SerialVersionUID(42L)
class Person(val name: String) extends Serializable {

  private val friends = new ArrayBuffer[Person]

  def addFriend(p: Person) {
    friends += p
  }

  def isFriend(p: Person): Boolean = friends.contains(p)

}
