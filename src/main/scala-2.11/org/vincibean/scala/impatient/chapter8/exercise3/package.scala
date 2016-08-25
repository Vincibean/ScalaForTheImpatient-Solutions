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
  * Consult your favorite Java or C++ textbook that is sure to have an example
  * of a toy inheritance hierarchy, perhaps involving employees, pets, graphical
  * shapes, or the like. Implement the example in Scala.
  *
  * This example was taken and rewritten from "Java: Introduction to Problem Solving and Programming"
  * by Walter Savitch and Frank Carrano.
  *
  * Created by Vincibean on 23/01/16.
  */
package object exercise3 extends App {

  val student: Student = new Student()
  student.name = "Walter"
  student.registrationNumber = 123231
  student.printOutput()

  val person: Person = new Person()
  person.name = "George"
  person.printOutput()
  println(s"Do they have the same name? ${person.hasTheSameName(student)}")

  val anotherStudent: Student = new Student("Walter", 123231)
  anotherStudent.printOutput()
  println(s"Are the two students actually the same? ${anotherStudent.equals(student)}")

}
