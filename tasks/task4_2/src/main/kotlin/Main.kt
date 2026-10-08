// Task 4.2: use of if and ranges

fun main() {
    // Add your code here
    println("Pizza Menu:\n")
    println("(a) Margherita")
    println("(b) Pepperoni")
    println("(c) Veggie")
    println("(d) Meat")
    print("\nEnter option (a/b/c/d): ")

    var choice = readln().lowercase()

    if (choice[0] in 'a'..'b') {
        println("Order accepted!")
    } else {
        println("Invalid choice!")
    }
}
