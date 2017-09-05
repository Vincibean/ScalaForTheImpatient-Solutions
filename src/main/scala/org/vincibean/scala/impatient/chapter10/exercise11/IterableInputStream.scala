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

package org.vincibean.scala.impatient.chapter10.exercise11

import java.io.InputStream

import scala.collection.AbstractIterator

/**
  * Implement a class IterableInputStream that extends java.io.InputStream with the
  * trait Iterable[Byte].
  *
  * Created by Vincibean on 14/03/16.
  */
class IterableInputStream(is: InputStream) extends InputStream with Iterable[Byte] {

  override def iterator: Iterator[Byte] = new AbstractIterator[Byte] {

    override def hasNext: Boolean = is.available > 0

    override def next(): Byte = is.read().toByte

  }

  override def read(): Int = is.read()

}
