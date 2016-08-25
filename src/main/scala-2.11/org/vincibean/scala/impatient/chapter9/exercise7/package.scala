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
  * Write a Scala program that reads a text file and prints all tokens in the file
  * that are not floating-point numbers. Use a regular expression.
  *
  * Created by Vincibean on 27/01/16.
  */
package object exercise7 extends App {
  // I couldn't find any way to simply take all but floating points tokens.
  // Yet, I could find a way to look for floating point numbers; so, I'll just replace
  // the floating point numbers with... nothing.
  val source = Source.fromFile("resources/chapter9/exercise7/float.txt")
  println("""[0-9]+?\.[0-9]+""".r.replaceAllIn(source.mkString, "").split("""\s+""").mkString("; "))
  source.close

}
