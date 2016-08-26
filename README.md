# Scala for the Impatient - Solutions
My own solutions to the exercises contained in [Scala for the Impatient](http://www.horstmann.com/scala/index.html) by [Cay Horstmann](http://www.horstmann.com/).

## Project Description
I decided to share these solutions here in order to help those who couldn't get the hang of one or more exercise(s).

## Project Structure
The project follows the same structure of the book: each chapter is a distinct package, containing as many subpackages 
as there are exercises in that chapter.

Each exercise package generally contains: 
* **A text file**: used in all those cases in which the exercise wasn't a programming assignment. It contains both the 
question and the answer;
* **A Scala Worksheet**: a worksheet is a Scala file that is evaluated on save, and the result of each expression is 
shown in a column to the right of your program. Worksheets are like a REPL session on steroids, and enjoy first class 
editor support: completion, hyperlinking, interactive errors-as-you-type, auto-format, etc. They are available for all
major IDEs (like [Eclipse](https://github.com/scala-ide/scala-worksheet/wiki/Getting-Started) and 
[IntelliJ IDEA](https://confluence.jetbrains.com/display/IntelliJIDEA/Working+with+Scala+Worksheet)). As such, while not
explicitly covered in the book, they represent a great way to learn Scala, so I strongly suggest to use them. In this 
project, they are used to test the right functioning of the solution;
* **One or more Scala class(es), Object(s) or Package Object**: when explicitly asked by the exercise, I created classes 
and/or objects and placed them in the corresponding exercise package. The only exception to this rule was when the exercise
required the creation of mere functions. In that case, I avoided placing them in the Worksheet (since it should only 
contain the test code), yet I didn't like the idea of creating an object only for containing them. Hence, I resorted to
[Package Objects](http://www.scala-lang.org/docu/files/packageobjects/packageobjects.html): objects that,
logically, represent the top level of a package. This is the only exception I allowed to the "solutions as close as 
possible to the content of the relevant chapter" rule. If you don't feel comfortable with them, just consider them as 
objects which (coincidentally!) have the same name of the package containing them and a slightly different signature from
your typical object.

The resources folder, too, follows the same structure of the book.

The project uses [SBT](http://www.scala-sbt.org/), yet it is used only for granting a standard structure to the project, 
and to enforce the Scala version. Hence, you don't need to know SBT to understand the solutions.

## Important Notes
* I am in no way affiliated with Addison-Wesley or Cay Horstmann, hence you should **NOT** consider these as the "official" solutions;
* I struggled to maintain the solutions as close as possible to the content of the relevant chapter; as such, some of the
solutions might seem odd to an experienced Scala programmer; 
* For the same reason, I avoided using testing framework (like [ScalaTest](http://www.scalatest.org/), 
[ScalaCheck](http://www.scalacheck.org/), etc...): while they represent a fundamental building block of the Scala ecosystem, 
the book doesn't explore them, so, in order to ease the understanding of the solutions, I favored the aforementioned Scala
Worksheet instead;
* These solutions reflect my own knowledge and my preferences regarding the Scala programming language; as such, they might be 
incomplete or convoluted. Should you find a better, more elegant solution, don't hesitate to give me your feedback and/or start a new pull request.

## License
This software is licensed under the [GNU General Public License, version 3 (GPL-3.0)](https://opensource.org/licenses/GPL-3.0).
