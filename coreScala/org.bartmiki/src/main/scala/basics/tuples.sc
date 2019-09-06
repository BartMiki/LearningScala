// Tuple with 3 different type elements
val truth = (42, "answer to everything",true)

// Access to tule members with ._INDEX operator (unlike arrays first index is 1)
println(s"It is ${truth._3}, that ${truth._1} is ${truth._2}")

// Key, value pair
val tupleSyntax = ('A','A'.toInt)
val keyValueSyntax = 'A' -> 'A'.toInt

println(s"Is (\'A\',${tupleSyntax._2}) equal to (\'A\'->${keyValueSyntax._2})? ${tupleSyntax == keyValueSyntax}")

