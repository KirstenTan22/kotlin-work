// Task 5.3.2: rollDice() function

import kotlin.random.Random

fun rollDice(sides: Int = 6, numOfDice: Int = 1) {

    repeat(numOfDice) {
        if (sides in setOf(4, 6, 8, 10, 12, 20)) {
        println("rolling a d$sides...")
        val result = Random.nextInt(1, sides + 1)
        println("You rolled $result")
        }
        else {
            println("error: cannot have a $sides-sided die")
        }
    }
}