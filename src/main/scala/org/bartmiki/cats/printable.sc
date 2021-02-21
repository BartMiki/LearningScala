// Start writing your ScalaFiddle code here
trait Printable[A] {
  def format(value: A): String
}

object PrintableInstances {
  implicit val printableInt = new Printable[Int] {
    def format(value: Int): String = value.toString
  } 
  
    implicit val printableString = new Printable[String] {
    def format(value: String): String = value
  } 
}

object Printable {
  def format[A](value: A)(implicit p: Printable[A]): String = p.format(value)
  
  def print[A](value: A)(implicit p: Printable[A]): Unit = println(p.format(value))
}

import PrintableInstances._

Printable.print(1234)
Printable.print("2 ad 432")

final case class Cat (name: String, age: Int, color: String)
val cat = Cat ("Filemon", 3, "black")

implicit val printableCat = new Printable[Cat] {
  def format(value: Cat): String = s"${value.name} is a ${value.age} year-old ${value.color} cat."
}

Printable.print(cat)

object PrintableSyntax {
  implicit class PrintableOps[A](value: A) {
    def format(implicit p: Printable[A]): String = p.format(value)
    
    def print(implicit p: Printable[A]): Unit = println(p.format(value))
  }
}

import PrintableSyntax._


1234.print
cat.print
