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

package org.vincibean.scala.impatient.chapter4

import scala.io.Source

/**
  * Repeat the preceding exercise with an immutable map.
  *
  * Created by Vincibean on 17/01/16.
  */
package object exercise3 extends App {

  // Using the Scalaesque way.
  var wordCount = Map.empty[String, Int] withDefaultValue 0
  for(word <- Source.fromFile("resources/chapter4/Exercise2.txt").mkString.split("\\s+")) {
    wordCount = wordCount + (word -> (wordCount(word) + 1))
  }
  println(wordCount.mkString(", "))

}