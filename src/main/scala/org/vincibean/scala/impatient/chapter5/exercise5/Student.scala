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

package org.vincibean.scala.impatient.chapter5.exercise5

import scala.beans.BeanProperty

/**
  * Make a class Student with read-write JavaBeans properties name (of type String)
  * and id (of type Long). What methods are generated? (Use javap to check). Can
  * you call the JavaBeans getters and setters in Scala? Should you?
  *
  * Created by Vincibean on 18/01/16.
  */
case class Student (@BeanProperty var name: String, @BeanProperty var id: Long)
