// Task 12.3.2: demo of Person class with secondary constructor
import kotlinx.datetime.LocalDate

fun main() {
    var d1 = LocalDate(2005, 2, 22)
    var p1 = Person("Kirsten", d1)

    var p2 = Person("Dawid", "2003-03-15")

    println("P1 Details:")
    println("- Name: ${p1.name}")
    println("- Birthday: ${p1.birth}")
    println("- Marrital Status: ${p1.isMarried}\n")

    println("P2 Details:")
    println("- Name: ${p2.name}")
    println("- Birthday: ${p2.birth}")
    println("- Marrital Status: ${p2.isMarried}")
}