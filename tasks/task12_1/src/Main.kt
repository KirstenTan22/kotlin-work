// Task 12.1: program that uses a Point object
fun main() {
    val p = Point(4.0, 5.0)
    val p2 = Point(4.5, 7.0)

    println(p.x)
    println(p.y)

    println("%.2f".format(p.distance()))
    println("%.2f".format(p.distanceTo(p2)))
}
