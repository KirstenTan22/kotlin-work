// Task 12.9: demo program for class implementing Static Factory Method
import kotlinx.datetime.LocalDate

fun main() {
    val bd = LocalDate.parse("2005-02-22")
    val p1 = Person.create("Kirsten", bd)
    val p2 = Person.create("Dawid", bd)
}