// Task 5.2.1: main program
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        exitProcess(1)
    }

    val radius = args[0].toDoubleOrNull()

    if (radius == null) {
        exitProcess(1)
    }

    val area = circleArea(radius)
    val perimeter = circlePerimeter(radius)

    println("Area: $area")
    println("Perimeter: $perimeter")
}