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

package org.vincibean.scala.impatient.chapter7

/**
  * In the preceding exercise, move all imports into the innermost scope possible.
  *
  * Created by Vincibean on 22/01/16.
  */
package object exercise7 extends App {

  import java.util.{HashMap => JavaHashMap}
  import java.util.{Map => JavaMap}

  val javaHashMap: JavaMap[String, Int] = new JavaHashMap[String, Int]()
  javaHashMap.put("a", 1)
  javaHashMap.put("b", 2)
  javaHashMap.put("c", 3)

  import scala.collection.JavaConversions._
  import scala.collection.mutable.{Map => ScalaMap}
  // We don't need to explicitly define a Scala HashMap: the compiler will do it for us.
  // While there is a more concise solution involving JavaConverter functions, this don't explicitly produce
  // a Scala Hash Map as required by the exercise.
  val scalaMap: ScalaMap[String, Int] = for {
    (k, v) <- javaHashMap
  } yield k -> v

  println(scalaMap.mkString(", "))
  println(s"Type of the map: ${scalaMap.getClass.getName}")

}
