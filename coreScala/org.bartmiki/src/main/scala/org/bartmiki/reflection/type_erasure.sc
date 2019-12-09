import scala.reflect.runtime.universe.{TypeTag, typeTag}

val list = List(1, 2, 3)
def getTypeTag[T: TypeTag](obj: T) = typeTag[T]
val theType = getTypeTag(list).tpe