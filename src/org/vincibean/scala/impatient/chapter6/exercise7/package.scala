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

import org.vincibean.scala.impatient.chapter6.exercise6.Seed
import org.vincibean.scala.impatient.chapter6.exercise6.Seed.Seed

/**
  * Implement a function that checks whether a card suit value from the preceding
  * exercise is red.
  *
  * Created by Vincibean on 20/01/16.
  */
package object exercise7 extends App {

  println(s"Is Clubs a red seed? ${isReedSeed(Seed.Clubs)}")
  println(s"Is Diamonds a red seed? ${isReedSeed(Seed.Diamonds)}")
  println(s"Is Hearts a red seed? ${isReedSeed(Seed.Hearts)}")
  println(s"Is Spades a red seed? ${isReedSeed(Seed.Spades)}")

  def isReedSeed(seed: Seed): Boolean = (seed == Seed.Hearts) || (seed == Seed.Clubs)

}
