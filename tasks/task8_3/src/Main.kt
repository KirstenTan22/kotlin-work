// Task 8.3: weather station temperature analysis program

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Add your code here
    if (args.size != 1) {
        println("Usage: ./kotlin run <filename>")
        exitProcess(1)
    }

    val filename = args[0]
    val records = fetchData(filename)

    val (lowStation, lowTemp) = records.minBy { it.second }
    val (highStation, highTemp) = records.maxBy { it.second }

    println("Lowest Temp")
    println("\tStation: $lowStation")
    println("\tTemp: $lowTemp\n")

    println("Highest Temp")
    println("\tStation: $highStation")
    println("\tTemp: $highTemp\n")

    val avgTemp = averageTemp(records)
    println("Average Temp: %.2f".format(avgTemp))

    records.sortedBy { it.first }.forEach { println(it) }
}
