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

package org.vincibean.scala.impatient.chapter5

/**
  * Write a class BankAccount with methods deposit and withdraw, and a read-only
  * property balance.
  *
  * Created by Vincibean on 18/01/16.
  */
package object Exercise2 extends App {

  val bankAccount = new BankAccount
  println(s"Initial balance is ${bankAccount.currentBalance}")  // Expected: 0
  // bankAccount.balance = 1000      // Won't compile
  bankAccount.deposit(1000)
  println(s"After a deposit of 1000, the balance is ${bankAccount.currentBalance}")   // Expected: 1000
  bankAccount.deposit(-1000)
  println(s"After a deposit of -1000, the balance is ${bankAccount.currentBalance}")   // Expected: 1000
  val withdraw = bankAccount.withdraw(1000)
  println(s"After a withdraw of $withdraw, the balance is ${bankAccount.currentBalance}")   // Expected: 0
  bankAccount.withdraw(-1000)
  println(s"After a withdraw of -1000, the balance is ${bankAccount.currentBalance}")   // Expected: 0
  val anotherWithdraw = bankAccount.withdraw(100)
  println(s"After a withdraw of $anotherWithdraw, the balance is ${bankAccount.currentBalance}")   // Expected: -100

}
