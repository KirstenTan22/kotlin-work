// Task 5.3.2: main program
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Usage: ./kotlin run <number of dice>d<sides>")
        exitProcess(1)
    }

    val arg = args[0].split("d")
    val numOfDice = arg[0].toIntOrNull()
    val sides = arg[1].toIntOrNull()

    if (numOfDice == null || sides == null) {
        println("Number of dice and sides must be integers.")
        exitProcess(1)
    }

    rollDice(sides, numOfDice)
}