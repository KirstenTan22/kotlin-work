// Task 12.4.1: main program
fun main() {
    var p1 = Point(0.0, 0.0)
    var p2 = Point(1.0, 2.0)
    var p3 = Point(5.0, 20.0)

    var points = mutableListOf(p1, p2, p3)

    var c1 = Circle(p1, 5.0)

    println("Area: ${c1.area()}")
    println("Perimeter: ${c1.perimeter()}")
    
    for (p in points) {
        if (c1 contains p) {
            println("Circle contains point (${p.x}, ${p.y})")
        }
    }
}