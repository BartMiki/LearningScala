// Basics
val basicString: String = "Hello Scala!"
val stringWithEscapeCharacter = "Best Regards,\nYour [insert_name_here]"
println(stringWithEscapeCharacter)

// String equality == compares values not references
val stringNo1 = "Scala is awesome!"
val stringNo2 = "Scala is awesome!"
val stringNo3 = "I love C# too <3"

val equal = s"Is \'$stringNo1\' equal \'$stringNo2\'? ${if(stringNo1 == stringNo2) "Yes!" else "No!"}"
val notEqual = s"Is \'$stringNo1\' equal \'$stringNo3\'? ${if(stringNo1 == stringNo3) "Yes!" else "No!"}"

// String multiplication
val theme = "Na " * 16 + "Batman!"

// Multiline strings - dot recognise escape chars
val iSpanMultipleLines =
  """I'm
    |learning
    |Scala
    |right
    |now!
    |Look \n i can't escape newline! :O
  """.stripMargin

// String interpolation
val age = 20
val interpolatedString = s"I'm $age years old!"

// String interpolation with expression
val simpleMath = s"2 + 2 = ${2+2}"

// Formated string - like interpolated but better!
val piRounding = f"PI with 5 digit precision ${Math.PI}%.5f"

// Regex - strings with .r postfix,
// use multiline strings to avoid escaping backslashes
// Regex Syntax: val <PATTERN>(<OUTPUTS>) = <INPUT>
val input = "Enjoying this apple 3.14159 times today"
val pattern = """.* apple ([\d.]+) times .*""".r

val pattern(numberText) = input
val number = numberText.toDouble
