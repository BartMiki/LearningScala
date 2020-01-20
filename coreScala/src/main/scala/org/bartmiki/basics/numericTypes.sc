// Numeric types - max value within type
val byte : Byte = Byte.MaxValue
val short: Short = Short.MaxValue
val int: Int = Int.MaxValue
val long: Long = Long.MaxValue
val float: Float = Float.MaxValue
val double: Double = Double.MaxValue

// Automatic conversion to higher ranks values:
val toShort = byte
val toInt = short
val toDouble = toInt

// Can't convert automatic to lesser rank:
// val toByte = short => error: type mismatch.
// You can always use member toType
// where Type type name you want to cast to:
val newShort = 17
val toByte = newShort.toByte

// Numeric literals:
val intLiteral = 234
val hexadecimalIntLiteral = 0x35ff
val longLiteral = 123214L // ending with letter 'l' or 'L' not number' 1'
val doubleLiteral = 3.14 // or 3.14d
val floatLiteral = 2.79F

