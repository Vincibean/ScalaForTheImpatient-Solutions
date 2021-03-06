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
  * Write a function doInOrder that, given two functions f: T => Future[U] and g: U
  * => Future[V], produces a function T => Future[U] that, for a given t, eventually
  * yields g(f(t)).
  */
package object exercise2 {

  // The signature was edited in order to return T => Future[V] : having this method return T => Future[U] doesn't make sense!
  def doInOrder[T, U, V](f: T => Future[U], g: U => Future[V])(implicit ec: ExecutionContext): T => Future[V] = (t: T) => for {
    u <- f(t)
    c <- g(u)
  } yield c

}
