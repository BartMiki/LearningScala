// Some types
object SomeObject
case class Person(name: String)
object Unmatchable

// Definition of partial function
val func : PartialFunction[Any, String] = {
  case SomeObject => "Got Some Object"
  case p: Person => s"This person's name is ${p.name}"
}

func(SomeObject)
func(Person("Peter"))
func(Unmatchable) // Throws MatchError

