// Task 7.7.1: program to compute stats for a numeric dataset
import kotlin.system.exitProcess

fun main(args: Array<String>) {
  if (args.size != 1) {
    println("Usage: ./kotlin run <filename>")
    exitProcess(1)
  }

  val numbers = readData(args[0])
  displayStats(numbers)
}