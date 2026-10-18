// Task 7.7.2: phone book simulator
import kotlin.system.exitProcess

const val CSV_FILENAME = "phone.csv"

fun main() {
    // Implement the main program here
    // (You can add other functions to this file if you wish)
    val db = createDatabase()

    db.load(CSV_FILENAME)

    do {
        print("Enter a contact's name or press 'q' to exit: ")
        val input = readln().trim()

        if (input != "q") {
            val name = input.lowercase().replaceFirstChar { it.uppercase() }

            if (name in db) {
                println("Contact Found:")
                println("\tName: $name")
                println("\tPhone: ${db[name]}")
            } else {
                println("Contact Not Found - Please add their details to the database")
                println("\tName: $name")
                print("\tEnter Phone: ")
                val number = readln().trim()
                db[name] = number
                println("\tAdded new contact.")
            }
        }
    } while (input != "q")

    db.save(CSV_FILENAME)
    println("Exiting the program...")
}
