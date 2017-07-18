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

package org.vincibean.scala.impatient.chapter10.exercise4

/**
  * Provide a CryptoLogger trait that encrypts the log messages with the Caesar
  * cipher. The key should be 3 by default, but it should be overridable by the user.
  * Provide usage examples with the default key and a key of -3.
  *
  * Created by Vincibean on 07/02/16.
  */
trait CryptoLogger {

  def log(msg: String, key: Int = 3): Unit = {
    println(msg.map(_ + key).map(_.toChar).mkString)
  }

}
