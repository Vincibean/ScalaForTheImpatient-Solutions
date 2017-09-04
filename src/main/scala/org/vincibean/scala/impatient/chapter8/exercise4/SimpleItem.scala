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

package org.vincibean.scala.impatient.chapter8.exercise4

/**
  * Define an abstract class Item with methods price and description. A SimpleItem is
  * an item whose price and description are specified in the constructor. Take
  * advantage of the fact that a val can override a def. A Bundle is an item that
  * contains other items. Its price is the sum of the prices in the bundle. Also
  * provide a mechanism for adding items to the bundle and a suitable description
  * method.
  *
  * Created by dre on 23/01/16.
  */
class SimpleItem(val price: Double, val description: String) extends Item
