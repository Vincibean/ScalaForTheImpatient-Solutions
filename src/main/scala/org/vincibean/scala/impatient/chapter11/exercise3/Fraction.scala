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

package org.vincibean.scala.impatient.chapter11.exercise3

/**
  * Implement the Fraction class with operations + - * /. Normalize fractions, for
  * example turning 15/-6 into -5/2. Divide by the greatest common divisor,
  * like this:
  *
  *   class Fraction(n: Int, d: Int) {
  *     private val num: Int = if (d == 0) 1 else n * sign(d) / gcd(n, d);
  *     private val den: Int = if (d == 0) 0 else d * sign(d) / gcd(n, d);
  *     override def toString = s"$num/$den"
  *     def sign(a: Int) = if (a > 0) 1 else if (a < 0) -1 else 0
  *     def gcd(a: Int, b: Int): Int = if (b == 0) abs(a) else gcd(b, a % b)
  *     ...
  *   }
  *
  */
object Fraction {

  def unapply(input: Fraction): Option[(Int, Int)] = if (input.den == 0) None else Some((input.num, input.den))

}

class Fraction(n: Int, d: Int) {
  private val num: Int = if (d == 0) 1 else n * sign(d) / gcd(n, d)
  private val den: Int = if (d == 0) 0 else d * sign(d) / gcd(n, d)

  override def toString: String = s"$num/$den"

  def sign(a: Int): Int = if (a > 0) 1 else if (a < 0) -1 else 0

  def gcd(a: Int, b: Int): Int = if (b == 0) abs(a) else gcd(b, a % b)

  private def abs(a: Int): Int = if (a >= 0) a else -a

  def +(that: Fraction): Fraction = new Fraction(this.num * that.den + that.num * this.den, this.den * that.den)

  def -(that: Fraction): Fraction = new Fraction(this.num * that.den - that.num * this.den, this.den * that.den)

  def *(that: Fraction): Fraction = new Fraction(this.num * that.num, this.den * that.den)

  def /(that: Fraction): Fraction = new Fraction(this.num * that.den, this.den * that.num)

}
