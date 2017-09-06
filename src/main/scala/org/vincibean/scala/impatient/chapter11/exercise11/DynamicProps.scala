package org.vincibean.scala.impatient.chapter11.exercise11

import java.util.Properties

import scala.collection.mutable
import scala.language.dynamics

import scala.collection.JavaConverters._

/**
  * Improve the dynamic property selector in Section 11.11, “Dynamic Invoca-
  * tion,” on page 150 so that one doesn’t have to use underscores. For example,
  * sysProps.java.home should select the property with key "java.home". Use a helper
  * class, also extending Dynamic, that contains partially completed paths.
  */
class DynamicProps extends Dynamic {

  // while this approach allows one to not use underscores, and as such satisfies the exercise,
  // it has a flaw: only works for "complex" selections (i.e. those with the dot notation).
  // "Normal" selections (without dots) won't work.
  private[this] val inners = mutable.Map.empty[String, InnerDynamicProps]

  def selectDynamic(name: String): InnerDynamicProps = {
    if (!inners.contains(name)) {
      val innerProp = new Properties()
      inners += (name -> new InnerDynamicProps(innerProp))
    }
    inners(name)
  }

  def toProps: Map[String, String] = {
    inners.mapValues(_.props)
      .mapValues(x => x.asScala)
      .flatMap {
        case (k, vs) => vs.map{
          case (ik, iv) => s"$k.$ik" -> iv
        }
      }.toMap
  }

}

class InnerDynamicProps(val props: Properties) extends Dynamic {

  def updateDynamic(name: String)(value: String): Unit = props.setProperty(name, value)

  def selectDynamic(name: String): String = props.getProperty(name)

}