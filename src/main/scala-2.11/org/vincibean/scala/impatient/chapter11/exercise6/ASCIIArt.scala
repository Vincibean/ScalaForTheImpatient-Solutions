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

package org.vincibean.scala.impatient.chapter11.exercise6

/**
  * Provide a class ASCIIArt whose objects contain figures such as
  *
  *  /\_/\
  * ( ' ' )
  * (  -  )
  *  | | |
  * (__|__)
  *
  * Supply operators for combining two ASCIIArt figures horizontally.
  *
  *  /\_/\    _______
  * ( ' ' )  / Hello \
  * (  -  ) <  Scala |
  *  | | |   \ Coder /
  * (__|__)   ______
  *
  * or vertically. Choose operators with appropriate precedence.
  *
  * Created by Vincibean on 12/09/16.
  */
class ASCIIArt(private val art: String) {

  override def toString: String = art

  def +(that: ASCIIArt): ASCIIArt = {
    val thatArt = that.art.split("\n").reverse      // reversing, since we are starting from the bottom
    val newArt = this.art
      .split("\n")
      .reverse                                      // same here
      .zip(thatArt)                                 // zipping with the other ASCII art
      .map {
        case (s1, s2) => s1 + (" " * 7) + s2        // then merging into a whole String separated by 7 white spaces
      }
      .reverse                                      // reversing the reverse sequence, which thus becomes correct again
      .mkString("\n")
    new ASCIIArt(newArt)
  }

  /**
    * Return a new ASCIIArt instance that combines the two ASCIIArt figures vertically.
    *
    * @param that another ASCIIArt instance whose ascii art will be combined vertically.
    * @return a new ASCIIArt instance that combines the two ASCIIArt figures vertically.
    */
  def &(that: ASCIIArt): ASCIIArt = new ASCIIArt(this.art + "\n" + that.art)

}
