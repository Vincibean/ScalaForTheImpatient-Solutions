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

import scala.io.Source

/**
  * Make a regular expression searching for quoted strings "like this, maybe with
  * \" or \\" in a Java or C++ program. Write a Scala program that prints out all
  * such strings in a source file.
  *
  * Created by Vincibean on 27/01/16.
  */
package object exercise6 extends App {

  val inputFile = Source.fromFile("resources/chapter9/exercise6/quoted.txt")
  val inputFileString = inputFile.mkString
  // TODO Ends when a \" is found. Any ideas?
  val pattern = """"(?:[^"])*"""".r
  println(s"${pattern.findAllIn(inputFileString).mkString("\n")}")
  inputFile.close

}
