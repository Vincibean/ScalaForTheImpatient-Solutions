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

package org.vincibean.scala.impatient.chapter8.exercise9

/**
  * In the Creature class of Section 8.10, "Construction Order and Early Definitions",
  * on page 94, replace val range with a def. What happens when you also use a
  * def in the Ant subclass? What happens when you use a val in the subclass?
  * Why?
  *
  * Created by Vincibean on 24/01/16.
  */
class AntVal extends Creature {

  override val range = 2

}
