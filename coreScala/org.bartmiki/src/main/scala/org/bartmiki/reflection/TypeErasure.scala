package org.bartmiki.reflection

import scala.reflect.runtime.{universe => ru}

object TypeErasure {
  def main(args: Array[String]): Unit = {

    val l = List(1,2,3)

    def getTypeTag[T: ru.TypeTag](obj: T): ru.TypeTag[T] = ru.typeTag[T]

    val theType = getTypeTag(l).tpe
    println(theType)
  }
}
