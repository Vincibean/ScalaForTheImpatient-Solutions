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

import org.vincibean.scala.impatient.chapter5.exercise5.Student

// Testing the Student object
val student: Student = Student("Wesley Crusher", 10)
println(s"Student name: ${student.name}")
println(s"Student name (getter): ${student.getName}")
println(s"Student ID: ${student.id}")
println(s"Student ID (getter): ${student.getId}")
student.name = "Data"
println(s"Student name (after Scala setter): ${student.name}")
println(s"Student name (getter, after Scala setter): ${student.getName}")
student.setName("Beverly Crusher")
println(s"Student name (after Java setter): ${student.name}")
println(s"Student name (getter, after Java setter): ${student.getName}")
student.id = 3
println(s"Student ID (after Scala setter): ${student.id}")
println(s"Student ID (getter, after Scala setter): ${student.getId}")
student.setId(29)
println(s"Student ID (after Java setter): ${student.id}")
println(s"Student ID (getter, after Java setter): ${student.getId}")

// Other methods are generated from a case class like Student:
//
// public final java.lang.String toString();
// public org.vincibean.scala.impatient.chapter5.Exercise5.Student apply(java.lang.String, long);
// public scala.Option<scala.Tuple2<java.lang.String, java.lang.Object>> unapply(org.vincibean.scala.impatient.chapter5.Exercise5.Student);
// public java.lang.Object apply(java.lang.Object, java.lang.Object);
// public static scala.Option<scala.Tuple2<java.lang.String, java.lang.Object>> unapply(org.vincibean.scala.impatient.chapter5.Exercise5.Student);
// public static org.vincibean.scala.impatient.chapter5.Exercise5.Student apply(java.lang.String, long);
// public static scala.Function1<scala.Tuple2<java.lang.String, java.lang.Object>, org.vincibean.scala.impatient.chapter5.Exercise5.Student> tupled();
// public static scala.Function1<java.lang.String, scala.Function1<java.lang.Object, org.vincibean.scala.impatient.chapter5.Exercise5.Student>> curried();
// public org.vincibean.scala.impatient.chapter5.Exercise5.Student copy(java.lang.String, long);
// public java.lang.String copy$default$1();
// public long copy$default$2();
// public java.lang.String productPrefix();
// public int productArity();
// public java.lang.Object productElement(int);
// public scala.collection.Iterator<java.lang.Object> productIterator();
// public boolean canEqual(java.lang.Object);
// public int hashCode();
// public java.lang.String toString();
// public boolean equals(java.lang.Object);
// public org.vincibean.scala.impatient.chapter5.Exercise5.Student(java.lang.String, long);
//
// In general, it is advisable to maintain a consistent style; hence, even if the @BeanProperty annotation allows us
// to call getter and setter, it would be better to use them in Java and use the other, "scalaesque" methods in Scala.