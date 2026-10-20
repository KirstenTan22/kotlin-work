// Task 8.3: functions for temperature analysis

import kotlin.io.path.Path
import kotlin.io.path.forEachLine
import kotlin.io.path.exists

typealias Record = Pair<String,Double>

fun fetchData(filename: String) = buildList {
    // Finish the implementation of this function
    val filePath = Path(filename)

    if (!filePath.exists()) {
        return@buildList
    }
    
    filePath.forEachLine {
        val (station, temp) = it.split(",")
        add(Record(station.trim(), temp.trim().toDouble()))
    }
}

// Challenge: compute average temperature with one line of code
// in main(), instead of using the function below!

fun averageTemp(data: List<Record>): Double {
    var sum = 0.0
    for (record in data) {
        sum += record.second
    }
    return sum / data.size
}
