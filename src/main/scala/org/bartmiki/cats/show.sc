import cats.Show
import cats.instances.int._
import cats.instances.string._
import cats.syntax.show._

val showInt = Show.apply[Int]
println(showInt.show(1234))

println(1234.show)

import java.util.Date

// implicit val dateShow: Show[Date] = new Show[Date] {
//   def show(date: Date): String = s"${date.getTime}ms from epoch"
// }

implicit val dateShow: Show[Date] = Show.show(date => s"${date.getTime}ms from epoch")

println(new Date().show)

final case class Cat (name: String, age: Int, color: String)
val cat = Cat ("Filemon", 3, "black")

implicit val catShow: Show[Cat] = Show.show(value => 
  s"${value.name} is a ${value.age} year-old ${value.color} cat."
)

println(cat.show)
