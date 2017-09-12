/*
 * Copyright (C) 2017  Vincibean <Andrea Bessi>
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
 *  along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package org.vincibean.scala.impatient.chapter15.exercise10

/**
  * Add assert(n >= 0) to a factorial method. Compile with assertions enabled and
  * verify that factorial(-1) throws an exception. Compile without assertions.
  * What happens? Use javap to check what happened to the assertion call.
  */
object Exercise10 {

  def main(args: Array[String]): Unit = {
    val n1 = 99
    println(s"The factorial of $n1 is ${factorial(n1)}")
    val n2 = -1
    println(s"The factorial of $n2 is ${factorial(n2)}")
  }

  def factorial(n: Int): BigInt = {
    assert(n >= 0)
    (BigInt(1) to BigInt(n)).product
  }

}

/*
Compiling with assertions enabled gives the following output:

  The factorial of 99 is 933262154439441526816992388562667004907159682643816214685929638952175999932299156089414639761565182862536979208272237582511852109168640000000000000000000000
  java.lang.AssertionError: assertion failed
  	at scala.Predef$.assert(Predef.scala:204)
  	at Exercise10$.factorial(Exercise10.scala:35)
  	at Exercise10$.main(Exercise10.scala:31)
  	at Exercise10.main(Exercise10.scala)
  	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
  	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
  	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
  	at java.lang.reflect.Method.invoke(Method.java:497)
  	at scala.reflect.internal.util.ScalaClassLoader.$anonfun$run$2(ScalaClassLoader.scala:98)
  	at scala.reflect.internal.util.ScalaClassLoader.asContext(ScalaClassLoader.scala:32)
  	at scala.reflect.internal.util.ScalaClassLoader.asContext$(ScalaClassLoader.scala:30)
  	at scala.reflect.internal.util.ScalaClassLoader$URLClassLoader.asContext(ScalaClassLoader.scala:129)
  	at scala.reflect.internal.util.ScalaClassLoader.run(ScalaClassLoader.scala:98)
  	at scala.reflect.internal.util.ScalaClassLoader.run$(ScalaClassLoader.scala:90)
  	at scala.reflect.internal.util.ScalaClassLoader$URLClassLoader.run(ScalaClassLoader.scala:129)
  	at scala.tools.nsc.CommonRunner.run(ObjectRunner.scala:22)
  	at scala.tools.nsc.CommonRunner.run$(ObjectRunner.scala:21)
  	at scala.tools.nsc.ObjectRunner$.run(ObjectRunner.scala:39)
  	at scala.tools.nsc.CommonRunner.runAndCatch(ObjectRunner.scala:29)
  	at scala.tools.nsc.CommonRunner.runAndCatch$(ObjectRunner.scala:28)
  	at scala.tools.nsc.ObjectRunner$.runAndCatch(ObjectRunner.scala:39)
  	at scala.tools.nsc.MainGenericRunner.runTarget$1(MainGenericRunner.scala:66)
  	at scala.tools.nsc.MainGenericRunner.run$1(MainGenericRunner.scala:85)
  	at scala.tools.nsc.MainGenericRunner.process(MainGenericRunner.scala:96)
  	at scala.tools.nsc.MainGenericRunner$.main(MainGenericRunner.scala:101)
  	at scala.tools.nsc.MainGenericRunner.main(MainGenericRunner.scala)

On the other hand, compiling with assertions disabled gives the following output:

  The factorial of 99 is 933262154439441526816992388562667004907159682643816214685929638952175999932299156089414639761565182862536979208272237582511852109168640000000000000000000000
  The factorial of -1 is 1

When compiling with assertions enabled, the following line is added to the bytecode:

  13: invokevirtual #81                 // Method scala/Predef$.assert:(Z)V

That is, the assert() method contained into the Predef object is invoked. Compiling with assertions disabled instead
removes this invocation.
 */