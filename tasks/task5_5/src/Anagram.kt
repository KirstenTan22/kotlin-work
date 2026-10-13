// Task 5.1.1: anagrams() function
fun anagrams(first: String, second: String): Boolean {
    if (first.length != second.length) {
        return false
    }
    val firstChars = first.lowercase().toList().sorted()
    val secondChars = second.lowercase().toList().sorted()
    return firstChars == secondChars
}

infix fun String.anagramOf(cmpStr: String) = this.lowercase().toList().sorted() == cmpStr.lowercase().toList().sorted()