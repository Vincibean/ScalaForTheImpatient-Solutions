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

package org.vincibean.scala.impatient.chapter11.exercise8

/**
  * Provide a class Matrix. Choose whether you want to implement 2 x 2 matrices,
  * square matrices of any size, or m x n matrices. Supply operations + and *. The
  * latter should also work with scalars, for example mat * 2. A single element
  * should be accessible as mat(row, col).
  */
class Matrix(private val mat: Seq[Seq[Double]]) {
  require(mat.forall(_.length == mat.head.length))
  // all elements should have the same length

  private val cols = mat.length
  private val rows = mat.head.length

  def *(n: Double): Matrix = new Matrix(mat.map(_.map(_ * n)))

  // Inspired by https://rosettacode.org/wiki/Matrix_multiplication#Scala
  def *(that: Matrix): Matrix = {
    checkDimsForMultiplication(that)
    val res = for (row <- this.mat)
      yield for (col <- that.mat.transpose)
        yield row.zip(col).map(Function.tupled(_ * _)).sum
    new Matrix(res)
  }

  def +(that: Matrix): Matrix = {
    checkDimsForSum(that)
    val res = this.mat
      .zip(that.mat)
      .map(z => z._1.zip(z._2))
      .map(_.map(t => t._1 + t._2))
    new Matrix(res)
  }

  private def checkDimsForSum(that: Matrix): Unit = {
    if (this.cols != that.cols || this.rows != that.rows)
      throw new UnsupportedOperationException
  }

  private def checkDimsForMultiplication(that: Matrix): Unit = {
    if (this.cols != that.rows || this.rows != that.cols)
      throw new UnsupportedOperationException
  }

  override def toString: String = mat.toString

}