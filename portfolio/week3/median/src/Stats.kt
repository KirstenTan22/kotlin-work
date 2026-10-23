// Task 7.7.1: statistics functions
fun median(numbers: List<Float>): Float {
  if (numbers.isEmpty()) {
    throw IllegalArgumentException ("Error: List cannot be empty.")
  }
  
  val sortedNumbers = numbers.sorted()
  val mid = sortedNumbers.size / 2

  if (sortedNumbers.size % 2 == 0) { // If list size is even
    return ((sortedNumbers[mid-1] + sortedNumbers[mid]) / 2)
  } else {
    return sortedNumbers[mid]
  }
}

fun displayStats(numbers: List<Float>) {
  println("Numbers: $numbers")
  println("Minimum: ${numbers.min()}")
  println("Maximum: ${numbers.max()}")
  println("Mean: ${numbers.average()}")
  println("Median: ${median(numbers)}")
}