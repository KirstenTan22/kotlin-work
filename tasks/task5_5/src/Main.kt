// Task 5.1.1: main program
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 2) {
        println("Usage: ./kotlin run <word1> <word2>")
        exitProcess(1)
    }

    val first = args[0]
    val second = args[1]

    if (first anagramOf second) {
        println("$first and $second are anagrams.")
    }
    else {
        println("$first and $second are not anagrams.")
    }
}