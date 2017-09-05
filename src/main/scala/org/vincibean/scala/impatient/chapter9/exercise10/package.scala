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

package org.vincibean.scala.impatient.chapter9

import java.io.{ObjectInputStream, FileInputStream, ObjectOutputStream, FileOutputStream}

/**
  * Expand the example in Section 9.8, “Serialization,” on page 113. Construct a
  * few Person objects, make some of them friends of another, and save an
  * Array[Person] to a file. Read the array back in and verify that the friend relations
  * are intact.
  */
package object exercise10 {

  def preparePeople(): Array[Person] = {
    val p1 = new Person("p1")
    val p2 = new Person("p2")
    val p3 = new Person("p3")
    val p4 = new Person("p4")
    val p5 = new Person("p5")
    val p6 = new Person("p6")

    p1.addFriend(p2)
    p2.addFriend(p3)
    p3.addFriend(p1)

    p4.addFriend(p5)
    p5.addFriend(p4)

    Array(p1, p2, p3, p4, p5, p6)
  }

  def seralizeAndDeserialize(people: Array[Person]): Array[Person] = {
    // N.B.: The overridden file will be the one produced by SBT! You can find it in the target folder
    // corresponding to this exercise.
    val out = new ObjectOutputStream(new FileOutputStream(getClass.getClassLoader.getResource("chapter9/exercise10/people.obj").getPath))
    out.writeObject(people)
    out.close()

    val in = new ObjectInputStream(new FileInputStream(getClass.getClassLoader.getResource("chapter9/exercise10/people.obj").getPath))
    val savedPeople = in.readObject().asInstanceOf[Array[Person]]
    in.close()
    savedPeople
  }

}
