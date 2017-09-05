/*
 * Copyright (C) 2017  Vincibean <Andre Bessi>
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

package org.vincibean.scala.impatient.chapter10.exercise7

/**
  * Construct an example where a class needs to be recompiled when one of the
  * mixins changes. Start with class SavingsAccount extends Account with ConsoleLogger.
  * Put each class and trait in a separate source file. Add a field to Account. In Main
  * (also in a separate source file), construct a SavingsAccount and access the new
  * field. Recompile all files except for SavingsAccount and verify that the program works.
  * Now add a field to ConsoleLogger and access it in Main. Again, recompile
  * all files except for SavingsAccount. What happens? Why?
  */
class SavingsAccount extends Account with ConsoleLogger {

  def deposit(amount: Int): Unit = {
    // Avoid negative deposits
    if (amount > 0) {
      balance += amount
    }
  }

  def withdraw(amount: Int): Int = {
    // Avoid negative withdraws and don't let the balance be negative.
    if (amount > 0 && balance - amount > 0) {
      balance -= amount
      amount
    } else {
      log("Operation not permitted")
      0
    }
  }

}
