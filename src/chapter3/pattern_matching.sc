import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match

import scala.util.control.Exception

val x = 10
val y = 20

//noinspection SimplifyBooleanMatch
//Match to replace if...else
val max = x > y match {
  case true => x
  case false => y
}

//Match as simple switch...case, last expression is returned by match
val status = 500
val message = status match {
  case 200 => "ok"
  case 400 =>
    println("We screw up")
    "error"
  case 500 =>
    println("They screw up")
    "error"
}

//Multiple match cases
val dayOfWeek = 6
val dayType = dayOfWeek match {
  case 1 | 2 | 3 | 4 | 5 => "weekday"
  case 6 | 7 => "weekend"
}

//When matched fails exceptions is thrown
try {
  "Match me!" match {case "Nope!" => "Sorry..."}
} catch{
  case _: MatchError => println("Exception was thrown")
}

//Wildcard _ (underscore) is used to match any value
val noMatchForMe = "You wont catch me!"
noMatchForMe match {
  case "We'll see.." => "... next time!"
  case _ => "Gotcha!"
}