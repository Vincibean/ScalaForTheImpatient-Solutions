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

package org.vincibean.scala.impatient.chapter6

/**
  * Write an enumeration describing the four playing card suits so that the toString
  * method returns ♣, ♦, ♥, or ♠.
  *
  * Created by Vincibean on 20/01/16.
  */
package object exercise8 extends App {

  println(s"${RGB.Red}: ${RGB.Red.id}")
  println(s"${RGB.Green}: ${RGB.Green.id}")
  println(s"${RGB.Blue}: ${RGB.Blue.id}")
  println(s"${RGB.RedGreen}: ${RGB.RedGreen.id}")
  println(s"${RGB.RedBlue}: ${RGB.RedBlue.id}")
  println(s"${RGB.GreenBlue}: ${RGB.GreenBlue.id}")
  println(s"${RGB.Black}: ${RGB.Black.id}")
  println(s"${RGB.White}: ${RGB.White.id}")

}
