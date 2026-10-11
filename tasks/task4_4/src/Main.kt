// Task 4.4: temperature conversion using a while loop

import kotlin.system.exitProcess

import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.BorderType
import com.github.ajalt.mordant.rendering.TextAlign
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.rendering.TextStyles.*
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal

fun  celsiusToFahrenheit(c: Double): Double {
    var f = c * 9.0 / 5.0 + 32.0
    return f
}

fun main(args: Array<String>) {
    val terminal = Terminal()
    
    if (args.size != 3) {
        println("Usage: <start_temp> <max_temp> <step>")
        exitProcess(1)
    }

    var start_cel = args[0].toDoubleOrNull()
    val max_cel = args[1].toDoubleOrNull()
    val step = args[2].toDoubleOrNull()

    if (start_cel == null || max_cel == null || step == null) {
        println("Error: All three arguments must be numbers.")
        exitProcess(1)
    }

    if (max_cel < start_cel) {
        println("Error: Max temp must be greater than the starting temp.")
    }

    if (step < 1) {
        println("Error: Step must be a positive number.")
        exitProcess(1)
    }

    val output = table {
        borderType = BorderType.SQUARE_DOUBLE_SECTION_SEPARATOR
        borderStyle = brightBlue
        align = TextAlign.RIGHT
        
        header {
            style = bold + brightWhite
            row("°C", "°F")
        }

        body {
            rowStyles(cyan, brightCyan)

            var cur_cel = start_cel
            while (cur_cel < max_cel) {
                val cur_fah = celsiusToFahrenheit(cur_cel)
                row("%.1f".format(cur_cel), "%.1f".format(cur_fah))
                cur_cel += step
            }
        }

        captionBottom(dim("Celsius -> Fahrenheit"))
    }

    terminal.println(output)
}
