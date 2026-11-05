// Task 15.2.3: demo program

fun main() {
    val savings = SavingsAccount("Kirsten", 1.8)

    savings.deposit(1250)
    repeat(5) { savings.applyInterest() }
    savings.withdraw(50)
    println(savings.balance)
}
