// COMP2850 Portfolio: Week 3
// Tests for median()
 
import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            median(listOf())
        }
    }

    "Median of {1.0f} is correct" {
        val numbers = listOf(1.0f)
        median(numbers) shouldBe (1.0f plusOrMinus tolerance)
    }

    "Median of {6.0f, 1.0f} is correct" {
        val numbers = listOf(6.0f, 1.0f)
        median(numbers) shouldBe (3.5f plusOrMinus tolerance)
    }

    "Median of {3.0f, 4.0f, 1.0f} is correct" {
        val numbers = listOf(3.0f, 4.0f, 1.0f)
        median(numbers) shouldBe (3.0f plusOrMinus tolerance)
    }

    "Median of {3.0f, 4.0f, 1.0f, 10.0f} is correct" {
        val numbers = listOf(3.0f, 4.0f, 1.0f, 10.0f)
        median(numbers) shouldBe (3.5f plusOrMinus tolerance)
    }
})
