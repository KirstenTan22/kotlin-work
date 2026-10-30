// Task 12.5.2: demo program for class with custom getter
import kotlinx.datetime.LocalDate

fun main() {
  val d = LocalDate.parse("2003-03-15")
  val p = Person("Dawid", d)

  println(p.name)
  println(p.birth)
}