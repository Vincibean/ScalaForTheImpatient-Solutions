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

package org.vincibean.scala.impatient.chapter2

/**
  * Write a Scala equivalent for the Java loop:
  * for (int i = 10; i >= 0; i--) System.out.println(i);
  *
  * Created by Vincibean on 11/01/16.
  */
object Exercise4 extends App {
  println("One simple way: explicitly defining the step as -1")
  for (i <- 10.to(0, -1)) println(i)
  println("Another simple way: reversing the Range")
  for (i <- (1 to 10).reverse) println(i)
}
