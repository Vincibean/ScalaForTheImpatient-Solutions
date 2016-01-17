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

import scala.collection.JavaConversions.propertiesAsScalaMap

/**
  * Print a table of all Java properties, like this:
  *
  *   java.runtime.name           | Java(TM) SE Runtime Environment
  *   sun.boot.library.path       | /home/apps/jdk1.6.0_21/jre/lib/i386
  *   java.vm.version             | 17.0-b16
  *   java.vm.vendor              | Sun Microsystems Inc.
  *   java.vendor.url             | http://java.sun.com/
  *   path.separator              | :
  *   java.vm.name                | Java HotSpot(TM) Server VM
  *
  * You need to find the length of the longest key before you can print the table.
  *
  * Created by Vincibean on 17/01/16.
  */
object Exercise7 extends App {

  val properties: scala.collection.mutable.Map[String, String] = System.getProperties

  implicit val cmp : scala.Ordering[String] = new Ordering[String](){
    override def compare(x: String, y: String): Int = x.length - y.length
  }

  val maxLengthProperty = properties.keySet.max.length
  properties.foreach((t: (String, String)) =>
    println(t._1 + (" " * (maxLengthProperty - t._1.length) + " | " + t._2)))

}