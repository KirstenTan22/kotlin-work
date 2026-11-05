// Task 15.2.3: SavingsAccount class
import kotlin.math.roundToInt

class SavingsAccount(holder: String, val rate: Double) : BankAccount(holder) {
    init {
        require(rate > 0) { "Interest rate must be greater than 0."}
    }

    fun applyInterest() {
        val ratePercent = rate / 100.0
        val accruedInterest = (balance * ratePercent).roundToInt()
        deposit(accruedInterest)
    }
}