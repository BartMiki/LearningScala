import cats.Eq
import cats.syntax.eq._

import cats.instances.int._
import cats.instances.string._
import cats.instances.option._

final case class Cat (name: String, age: Int, color: String)

implicit val eqCat: Eq[Cat] = new Eq[Cat]{
  def eqv(c1: Cat, c2: Cat): Boolean = c1 == c2
}

val cat1 = Cat("Garfield", 38, "orange and black") 
val cat2 = Cat("Heathcliff", 33, "orange and black")

println(cat1 === cat2)
println(cat1 =!= cat2)

val optionCat1 = Option(cat1) 
val optionCat2 = Option.empty[Cat]

println(optionCat1 === optionCat2)
println(optionCat1 =!= optionCat2)
