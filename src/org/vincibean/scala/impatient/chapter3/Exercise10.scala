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

package org.vincibean.scala.impatient.chapter3

import java.awt.datatransfer._

import scala.collection.JavaConversions.asScalaBuffer
import scala.collection.mutable

/**
  * Import java.awt.datatransfer._ and make an object of type SystemFlavorMap with the call
  *   val flavors = SystemFlavorMap.getDefaultFlavorMap().asInstanceOf[SystemFlavorMap]
  * Then call the getNativesForFlavor method with parameter DataFlavor.imageFlavor
  * and get the return value as a Scala buffer. (Why this obscure class? It’s hard
  * to find uses of java.util.List in the standard Java library.)
  *
  * Created by Vincibean on 13/01/16.
  */
object Exercise10 extends App {
  val flavors = SystemFlavorMap.getDefaultFlavorMap.asInstanceOf[SystemFlavorMap]
  val flavorsBuffer : mutable.Buffer[String] = flavors.getNativesForFlavor(DataFlavor.imageFlavor)
  println("Did we really manage to turn a java.util.List to a scala.collection.mutable.Buffer? " +
    s"${flavorsBuffer.isInstanceOf[mutable.Buffer[String]]}")
}
