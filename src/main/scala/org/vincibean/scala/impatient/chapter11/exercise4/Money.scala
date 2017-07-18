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

package org.vincibean.scala.impatient.chapter11.exercise4

/**
  * Implement a class Money with fields for dollars and cents. Supply +, - operators
  * as well as comparison operators == and <. For example, Money(1, 75) + Money(0, 50)
  * == Money(2, 25) should be true. Should you also supply * and / operators? Why
  * or why not?
  *
  * Created by Vincibean on 11/09/16.
  */
object Money {

  def apply(dollars: Int, cents: Int): Money = new Money(dollars, cents)

  def apply(cents: Int): Money = new Money(cents / 100, cents % 100)

}

class Money(dollars: Int, cents: Int) {
  private val ds: Int = toCents / 100
  private val cs: Int = toCents % 100

  override def toString: String = s"$$$ds.${Math.abs(cs)}"

  def +(that: Money): Money = Money(this.toCents + that.toCents)

  def -(that: Money): Money = Money(this.toCents - that.toCents)

  def ==(that: Money): Boolean = this.toCents == that.toCents

  def <(that: Money): Boolean = this.toCents < that.toCents

  private def toCents = dollars * 100 + cents

}
