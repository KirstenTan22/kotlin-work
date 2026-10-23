// COMP2850 Portfolio: Week 3
import kotlin.system.exitProcess
import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

// Add isValidTriangle() and triangleArea() functions here
fun isValidTriangle(triangle: Triangle): Boolean {
  val a = triangle.first
  val b = triangle.second
  val c = triangle.third

  if (a >= b + c || b >= a + c || c >= a + b) {
    throw IllegalArgumentException("Error: Invalid triangle.")
    return false
  }

  return true
}

fun triangleArea(triangle: Triangle): Double {
  val a = triangle.first
  val b = triangle.second
  val c = triangle.third

  if (!isValidTriangle(Triple(a, b, c))) {
    throw IllegalArgumentException("Error: Invalid arguments.")
  }

  val s = 1.0/2*(a+b+c)
  val area = sqrt(s*(s-a)*(s-b)*(s-c))

  print(area)

  return area
}