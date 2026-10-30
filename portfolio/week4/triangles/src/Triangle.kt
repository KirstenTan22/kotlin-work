// COMP2850 Portfolio: Week 4
// Triangle class

import kotlin.system.exitProcess
import kotlin.math.sqrt

class Triangle(val sideA: Double, val sideB: Double, val sideC: Double) {
    val perimeter = sideA + sideB + sideC
    val semiPerimeter = perimeter / 2.0
    val area = sqrt(semiPerimeter*(semiPerimeter-sideA)*(semiPerimeter-sideB)*(semiPerimeter-sideC))
    
    init {
        require(isValid())
    }

    fun isValid() = !(sideA >= sideB + sideC || sideB >= sideA + sideC || sideC >= sideA + sideB)

    override fun toString() = "Triangle(${sideA}, ${sideB}, ${sideC})"
}