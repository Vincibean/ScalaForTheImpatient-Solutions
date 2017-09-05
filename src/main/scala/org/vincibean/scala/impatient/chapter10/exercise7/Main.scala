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
object Main {

  def main(args: Array[String]): Unit = {
    val acc = new SavingsAccount
    println(acc.bank)
    println("Printing to " + acc.loc)
    acc.deposit(100)
    acc.withdraw(100)
    acc.withdraw(1)
  }

  /**
    * After adding a field to Account ("bank"), constructing a SavingsAccount in Main, accessing the new field and
    * recompiling all but SavingsAccount, the program worked.
    *
    * After adding a field to ConsoleLogger ("loc"), constructing a SavingsAccount in Main, accessing the new field and
    * recompiling all but SavingsAccount a compile time exception was thrown:
    * 
    *   java.lang.AbstractMethodError: Method SavingsAccount.ConsoleLogger$_setter_$loc_$eq(Ljava/lang/String;)V is abstract
    *    at SavingsAccount.ConsoleLogger$_setter_$loc_$eq(SavingsAccount.scala)
    *    at ConsoleLogger.$init$(ConsoleLogger.scala:30)
    *    at SavingsAccount.<init>(SavingsAccount.scala:29)
    *    at Main$.main(Main.scala:32)
    *    at Main.main(Main.scala)
    *    at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
    *    at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
    *    at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
    *    at java.lang.reflect.Method.invoke(Method.java:497)
    *    at scala.reflect.internal.util.ScalaClassLoader.$anonfun$run$2(ScalaClassLoader.scala:98)
    *    at scala.reflect.internal.util.ScalaClassLoader.asContext(ScalaClassLoader.scala:32)
    *    at scala.reflect.internal.util.ScalaClassLoader.asContext$(ScalaClassLoader.scala:30)
    *    at scala.reflect.internal.util.ScalaClassLoader$URLClassLoader.asContext(ScalaClassLoader.scala:129)
    *    at scala.reflect.internal.util.ScalaClassLoader.run(ScalaClassLoader.scala:98)
    *    at scala.reflect.internal.util.ScalaClassLoader.run$(ScalaClassLoader.scala:90)
    *    at scala.reflect.internal.util.ScalaClassLoader$URLClassLoader.run(ScalaClassLoader.scala:129)
    *    at scala.tools.nsc.CommonRunner.run(ObjectRunner.scala:22)
    *    at scala.tools.nsc.CommonRunner.run$(ObjectRunner.scala:21)
    *    at scala.tools.nsc.ObjectRunner$.run(ObjectRunner.scala:39)
    *    at scala.tools.nsc.CommonRunner.runAndCatch(ObjectRunner.scala:29)
    *    at scala.tools.nsc.CommonRunner.runAndCatch$(ObjectRunner.scala:28)
    *    at scala.tools.nsc.ObjectRunner$.runAndCatch(ObjectRunner.scala:39)
    *    at scala.tools.nsc.MainGenericRunner.runTarget$1(MainGenericRunner.scala:66)
    *    at scala.tools.nsc.MainGenericRunner.run$1(MainGenericRunner.scala:85)
    *    at scala.tools.nsc.MainGenericRunner.process(MainGenericRunner.scala:96)
    *    at scala.tools.nsc.MainGenericRunner$.main(MainGenericRunner.scala:101)
    *    at scala.tools.nsc.MainGenericRunner.main(MainGenericRunner.scala)
    *
    * As written in the book (Section 10.8 "Concrete Fields in Traits", pag. 129):
    *
    *   "When you extend a class and then change the superclass, the subclass doesn’t have to be recompiled because
    *   the virtual machine understands inheritance. But when a trait changes, all classes that mix in that trait must
    *   be recompiled."
    *
    * The new field of Account ("bank") is inherited by its subclass SavingsAccount; this means that the virtual machine
    * will search for the new field in the newly compiled Account.
    * The new field of ConsoleLogger ("loc"), on the other hand, is not inherited by SavingsAccount, it's mixed in; this
    * means that the Scala compiler will add the new field to the SavingsAccount class, and for this reason
    * SavingsAccount now needs to be recompiled.
    */

}
