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

import scala.annotation.tailrec
import scala.concurrent.{ExecutionContext, Future}

/**
  * Write a method
  *
  *   Future[T] repeat(action: => T, until: T => Boolean)
  *
  * that asynchronously repeats the action until it produces a value that is
  * accepted by the until predicate, which should also run asynchronously. Test
  * with a function that reads a password from the console, and a function that
  * simulates a validity check by sleeping for a second and then checking
  * that the password is "secret". Hint: Use recursion.
  */
package object exercise6 {

  def repeat[T](action: => T, until: T => Boolean)(implicit ec: ExecutionContext): Future[T] = {

    @tailrec
    def loop(act: => T, p: T => Boolean): T = {
      val a = act
      if (p(a)) a else loop(act, p)
    }

    Future(loop(action, until))
  }

}
