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

import org.vincibean.scala.impatient.chapter8.exercise1.CheckingAccount

// Testing the created classes
private val balance: Double = 1000
println(s"Opening a new account with $balance dollars")
private val account: CheckingAccount = new CheckingAccount(balance)
private val deposit: Double = 100
println(s"Depositing $deposit dollars")
println(s"Resulting balance is: ${account.deposit(deposit)}")