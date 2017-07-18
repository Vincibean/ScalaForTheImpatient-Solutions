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

package org.vincibean.scala.impatient.chapter8.exercise2

import org.vincibean.scala.impatient.chapter8.exercise1.BankAccount

/**
  * Extend the BankAccount class of the preceding exercise into a class SavingsAccount
  * that earns interest every month (when a method earnMonthlyInterest is called)
  * and has three free deposits or withdrawals every month. Reset the transaction
  * count in the earnMonthlyInterest method.
  *
  * Created by Vincibean on 22/01/16.
  */
class SavingsAccount (initialBalance: Double) extends BankAccount(initialBalance) {

  private val charge: Double = 1

  private val rate: Double = 0.01

  private var transactionLeft = 3

  override def deposit(amount: Double): Double = {
    if (transactionLeft == 0) {
      super.deposit(amount - charge)
    } else {
      transactionLeft -= 1
      super.deposit(amount)
    }
  }

  override def withdraw(amount: Double): Double = {
    if (transactionLeft == 0) {
      super.withdraw(amount - charge)
    } else {
      transactionLeft -= 1
      super.withdraw(amount)
    }
  }

  def earnMonthlyInterest(): Unit = {
    transactionLeft = 5
    val currentBalance = deposit(0)
    deposit(currentBalance * rate)
  }

}
