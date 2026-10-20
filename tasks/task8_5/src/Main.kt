// Task 8.5: example of using a higher-order function

fun main() {
    // Add your testing code here
    val name = "Kirsten"

    val vowelCount = name.howMany { it.lowercase() in "aeiou" }
    val upperCount = name.howMany { it.uppercase() == it.toString() }
    val lowerCount = name.howMany { it.lowercase() == it.toString() }

    println(vowelCount)
    println(upperCount)
    println(lowerCount)
}
