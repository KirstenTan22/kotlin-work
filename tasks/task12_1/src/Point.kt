// Task 12.1: Point class
import kotlin.math.sqrt
import kotlin.math.hypot


class Point (var x: Double, var y: Double) {
    fun distance() = hypot(x, y)

    fun distanceTo(p2: Point) = hypot(p2.x - x, p2.y - y)
}