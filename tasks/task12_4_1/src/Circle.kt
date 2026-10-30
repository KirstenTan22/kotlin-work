// Task 12.4.1: Circle class
import kotlin.math.PI
import kotlin.math.hypot
import kotlin.math.pow


class Circle(val centre: Point, val radius: Double) {
    init {
        require(radius > 0) {"Error: Radius must be greater than zero."}
    }

    fun area() = PI * radius.pow(2)
    fun perimeter() = 2 * PI * radius
    infix fun contains(p: Point) = hypot(p.x - centre.x, p.y - centre.y) <= radius
}