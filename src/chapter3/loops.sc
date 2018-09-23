//Defining simple range <start> [to|until] <end> [by step]
val myFirstRange = 0 to 10
val odds = 1 until 10 by 2

//Simple for loop

println("Odds:")
for (odd <- 1 to 10 by 2) println(odd)

//For loop with yield creates collection

val evens = for ( even <- 0 to 10 by 2) yield even
println("Evens:")
evens.foreach(println)

//Iterator guards and multi line for
val dividableBy3And5 = for {
  x <- 0 to 100
  if x % 3 == 0
  if x % 5 == 0
} yield x
println(dividableBy3And5.mkString("", ", ", ""))

//
