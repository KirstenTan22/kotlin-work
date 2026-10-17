// Task 7.7.1: statistics functions
import kotlin.system.exitProcess

fun computeMedian(numbers: List<Float>): Float {
  if (numbers.isEmpty()) {
    println("Error: List cannot be empty.")
    exitProcess(1)
  }
  
  val sortedNumbers = numbers.sorted()
  val mid = sortedNumbers.size / 2

  if (sortedNumbers.size % 2 == 0) { // If list size is even
    return (numbers[mid-1] + numbers[mid] / 2)
  } else {
    return numbers[mid]
  }
}

fun displayStats(numbers: List<Float>) {
  println("Numbers: $numbers")
  println("Minimum: ${numbers.min()}")
  println("Maximum: ${numbers.max()}")
  println("Mean: ${numbers.average()}")
  println("Median: ${computeMedian(numbers)}")
}