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

// In the preceding exercise, move all imports into the innermost scope possible.
import java.util.{HashMap => JavaHashMap, Map => JavaMap}

val javaHashMap: JavaMap[String, Int] = new JavaHashMap[String, Int]()
javaHashMap.put("a", 1)
javaHashMap.put("b", 2)
javaHashMap.put("c", 3)

import scala.collection.JavaConverters._
import scala.collection.mutable.{Map => ScalaMap}
val scalaMap: ScalaMap[String, Int] = for {
  (k, v) <- javaHashMap.asScala
} yield k -> v

println(scalaMap.mkString(", "))
println(s"Type of the map: ${scalaMap.getClass.getName}")