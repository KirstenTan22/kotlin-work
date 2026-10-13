// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string
fun redact(input: String, textToRemove: String, charToAdd: Char = 'X'): String {
  val textToAdd = charToAdd.toString().repeat(textToRemove.length)
  val redactedInput = input.replace(textToRemove, textToAdd)
  
  return redactedInput
}