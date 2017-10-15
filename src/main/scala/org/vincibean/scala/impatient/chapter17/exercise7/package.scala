/*
 * Copyright (C) 2017  Vincibean <Andrea Bessi>
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
 *  along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package org.vincibean.scala.impatient.chapter17

import scala.concurrent.{ExecutionContext, Future}

/**
  * Write a program that counts the prime numbers between 1 and n, as reported
  * by BigInt.isProbablePrime. Divide the interval into p parts, where p is the number
  * of available processors. Count the primes in each part in concurrent futures
  * and combine the results.
  */
package object exercise7 {

  def countPrimesAsync(n: BigInt, processors: Int = 4, certainty: Int = 100)(implicit ec: ExecutionContext): Future[BigInt] = {
    def countPrimesAsync(is: Seq[BigInt]): Future[BigInt] = Future(is.count(i => i.isProbablePrime(certainty)))

    val interval = BigInt(1) to n
    val toGroup = (interval.size / processors.toDouble).ceil.toInt
    val chunks = interval.grouped(toGroup)
    val fs = chunks.map(countPrimesAsync)
    Future.sequence(fs).map(_.sum)
  }



}
