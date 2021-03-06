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

package org.vincibean.scala.impatient.chapter8.exercise1

/**
  * Extend the following BankAccount class to a CheckingAccount class that charges $1
  * for every deposit and withdrawal.
  *
  *   class BankAccount(initialBalance: Double) {
  *     private var balance = initialBalance
  *     def currentBalance = balance
  *     def deposit(amount: Double) = { balance += amount; balance }
  *     def withdraw(amount: Double) = { balance -= amount; balance }
  *   }
  *
  * Created by Vincibean on 22/01/16.
  */
class BankAccount(initialBalance: Double) {

  private var balance = initialBalance

  def currentBalance = balance

  def deposit(amount: Double): Double = {
    balance += amount
    balance
  }

  def withdraw(amount: Double): Double = {
    balance -= amount
    balance
  }

}
