// Task 4.5: summing odd integers with a for loop

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Usage: ./kotlin run <limit>")
        exitProcess(1)
    }

    val limit = args[0].toIntOrNull()

    if (limit == null) {
        println("Error: argument must be an integer.")
        exitProcess(1)
    }

    var sum = 0

    for (num in 1..limit step 2) {
        sum += num
    }

    println("Sum: $sum")
}
