import kotlin.system.exitProcess
import kotlin.math.roundToInt

// Task 4.3: grade calculation using a when expression
fun main(args: Array<String>) {
  if (args.size != 3 || args.any { it.toIntOrNull() == null }) {
    println("Please provide a 3 numeric grades as an argument.")
    exitProcess(1)
  }

  val mark1 = args[0].toInt()
  val mark2 = args[1].toInt()
  val mark3 = args[2].toInt()

  val avg_mark = (mark1 + mark2 + mark3)/3.0.roundToInt()

  val grade = when (avg_mark) {
    in 70..100  -> "Distinction"
    in 40..69   -> "Pass"
    in 0..39    -> "Fail"
    else        -> "?"
  }

  println("Final Grade: $grade")
  println("Aveerage Mark: $avg_mark")
}