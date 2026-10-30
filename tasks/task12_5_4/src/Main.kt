// Task 12.5.4: demo program for class with a computed property
import kotlinx.datetime.LocalDate

fun main() {
  val p = Person("Dawid", LocalDate.parse("2003-03-15"))

  println(p.name)
  println(p.birth)
  println(p.age)
}