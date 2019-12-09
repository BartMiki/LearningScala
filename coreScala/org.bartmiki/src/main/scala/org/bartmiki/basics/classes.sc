
// Simple class definition with default constructor
class Point(x: Int, y: Int, z: Int) {

  /**
   * Returns new Point moved by provided values, relative to original point
   */
  def move(dx: Int = 0, dy: Int = 0, dz: Int = 0): Point = new Point(x + dx, y + dy, z + dz)

  override def toString: String = s"($x,$y,$z)"
}

val p1 = new Point(1, 2, 3)
println(p1)

val p2 = p1.move(dy = 3, dz = -5)
println(p2)
