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

package org.vincibean.scala.impatient.chapter11.exercise7

/**
  * Implement a class BitSequence that stores a sequence of 64 bits packed in a Long
  * value. Supply apply and update operators to get and set an individual bit.
  *
  * Created by Vincibean on 12/09/16.
  */
class BitSequence {

  val l = new Array[Byte](64) // a 64 numbers long (no pun intended) sequence is too large for a Long

  def apply(pos: Int): Byte = l(pos)

  def update(pos: Int, value: Byte): Unit = l(pos) = value

  override def toString: String = l.mkString

}
