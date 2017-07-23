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

package org.vincibean.scala.impatient.chapter14

/**
  * Add a case class Multiple that is a subclass of the Item class. For example,
  * Multiple(10, Article("Blackwell Toaster", 29.95)) describes ten toasters. Of course,
  * you should be able to handle any items, such as bundles or multiples, in the
  * second argument. Extend the price function to handle this new case.
  */
package object exercise4 {

  abstract class Item
  case class Article(description: String, price: Double) extends Item
  case class Bundle(description: String, discount: Double, items: Item*) extends Item
  case class Multiple(num: Int, item: Item) extends Item


  def price(it: Item): Double = it match {
    case Bundle(_, d, its @ _*) => its.map(price).sum - d
    case Multiple(n, i) => n * price(i)
    case Article(_, p) => p
  }

}
