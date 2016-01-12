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

package org.vincibean.scala.impatient.chapter1

import BigInt.probablePrime
import scala.util.Random

/**
  * What do you need to import so that you can get a random prime as
  * probablePrime(100, Random), without any qualifiers before probablePrime and Random?
  * As a minimum, BigInt.probablePrime and scala.util.Random.
  *
  * Created by Vincibean on 11/01/16.
  */
object Exercise7 extends App {
  println(probablePrime(100, Random))
}
