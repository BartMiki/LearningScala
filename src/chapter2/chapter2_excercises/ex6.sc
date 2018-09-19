val input = "Frank,123 Main,925-555-1943,95122"
val pattern = """.+,.+,(\d+)-(\d+)-(\d+),.+""".r
val pattern(p1, p2, p3) = input

val phoneNumber = (p1.toInt, p2.toInt, p3.toInt)
