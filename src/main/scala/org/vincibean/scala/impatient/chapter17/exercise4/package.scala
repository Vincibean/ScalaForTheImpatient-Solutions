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
  * Write a function doTogether that, given two functions f: T => Future[U] and
  * g: U => Future[V], produces a function T => Future[(U, V)], running the two
  * computations in parallel and, for a given t, eventually yielding (f(t), g(t)).
  */
package object exercise4 {

  def doTogether[T, U, V](f: T => Future[U], g: U => Future[V])(implicit ec: ExecutionContext): T => Future[(U, V)] = (t: T) => for {
    u <- f(t)
    v <- g(u)
  } yield (u, v)

}
