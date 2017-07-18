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

package org.vincibean.scala.impatient.chapter5.exercise2

/**
  * Write a class BankAccount with methods deposit and withdraw , and a read-only
  * property balance.
  *
  * Created by Vincibean on 18/01/16.
  */
class BankAccount {

  // Initially, the account is empty.
  private var balance: Int = 0

  def currentBalance: Int = balance

  def deposit(amount: Int): Unit = {
    // Avoid negative deposits
    if (amount > 0) {
      balance += amount
    }
  }

  def withdraw(amount: Int): Int = {
    // Avoid negative withdraws, but let the balance be negative.
    if (amount > 0) {
      balance -= amount
      amount
    } else {
      0
    }
  }

}
