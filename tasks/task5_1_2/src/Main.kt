// Task 5.1.2: main program
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Usage: ./kotlin run <sides>")
        exitProcess(1)
    }

    val sides = args[0].toIntOrNull()

    if (sides == null) {
        println("Error: The number of sides must be an integer.")
        exitProcess(1)
    }

    println(rollDie(sides))
}