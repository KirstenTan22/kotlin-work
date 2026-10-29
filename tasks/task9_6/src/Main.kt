// Task 9.6: application to compute dataset variance

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Implement main program here
    require(args.size == 1) { "Usage: ./kotlin run <filename>"}

    try {
        val dataset = readData(args[0])
        val variance = variance(dataset)
        println("Dataset Size: ${args.size}")
        println("Variance: %.5f".format(variance))
    } catch (e: IllegalArgumentException) {
        println("Error: ${e.message}")
    }
       
}