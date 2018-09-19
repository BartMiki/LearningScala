val x = 10
val y = 20

//noinspection SimplifyBooleanMatch
val max = x > y match {
  case true => x
  case false => y
}

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