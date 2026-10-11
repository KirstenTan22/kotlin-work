// Task 4.7: finding the longest line in a file
import kotlin.io.path.Path
import kotlin.io.path.forEachLine
import kotlin.system.exitProcess

fun main(args: Array<String>) {
  if (args.size != 1) {
    println("Usage: ./kotlin run <filePath>")
    exitProcess(1)
  }

  val filePath = Path(args[0])

  var lineNum = 0
  var maxLine = 0
  var maxLength = 0

  filePath.forEachLine {
    lineNum += 1
    if (it.length > maxLength) {
      maxLength = it.length
      maxLine = lineNum
    }
  }

  println("Line $maxLine is the longest (length = $maxLength)")
}