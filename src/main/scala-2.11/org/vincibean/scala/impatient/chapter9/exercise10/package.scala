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
  * Expand the example with the serializable Person class that stores a collection
  * of friends. Construct a few Person objects, make some of them friends of
  * another, and then save an Array[Person] to a file. Read the array back in and
  * verify that the friend relations are intact.
  *
  * Created by Vincibean on 27/01/16.
  */
package object exercise10 extends App {

  val people = preparePeople()

  val savedPeople = seralizeAndDeserialize()

  val s1 = savedPeople(0)
  val s2 = savedPeople(1)
  val s3 = savedPeople(2)
  val s4 = savedPeople(3)
  val s5 = savedPeople(4)
  val s6 = savedPeople(5)

  println(s1.isFriend(s2) && s2.isFriend(s3) && s3.isFriend(s1) && s4.isFriend(s5) && s5.isFriend(s4))


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

  def seralizeAndDeserialize(): Array[Person] = {
    val out = new ObjectOutputStream(new FileOutputStream("resources/chapter9/exercise7/people.obj"))
    out.writeObject(people)
    out.close()

    val in = new ObjectInputStream(new FileInputStream("resources/chapter9/exercise7/people.obj"))
    val savedPeople = in.readObject().asInstanceOf[Array[Person]]
    in.close()
    savedPeople
  }

}
