// Task 12.5.3: demo program for class with custom setter
import kotlinx.datetime.LocalDate

fun main() {
  val d = LocalDate.parse("2003-03-15")
  val p = Person("Dawid", d)

  p.name = ""

  println(p.name)
}