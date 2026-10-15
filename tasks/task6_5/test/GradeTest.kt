// Task 6.5: unit tests for grade()

import io.kotest.assertions.assertSoftly
import io.kotest.assertions.withClue
import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe


@Suppress("unused")
class GradeTest : FreeSpec({
    "Mark between 70 and 100 gives a Distinction" {
        withClue("Mark=70") { grade(70) shouldBe "Distinction" }
        withClue("Mark=85") { grade(85) shouldBe "Distinction" }
        withClue("Mark=100") { grade(100) shouldBe "Distinction" }
    }

    "Mark between 70 and 100 gives a Distinction" {
        withClue("Mark=70") { grade(70) shouldBe "Distinction" }
        withClue("Mark=85") { grade(85) shouldBe "Distinction" }
        withClue("Mark=100") { grade(100) shouldBe "Distinction" }
    }

    "Mark between 70 and 100 gives a Distinction" {
        withClue("Mark=70") { grade(70) shouldBe "Distinction" }
        withClue("Mark=85") { grade(85) shouldBe "Distinction" }
        withClue("Mark=100") { grade(100) shouldBe "Distinction" }
    }

    "Marks less than 0 or greater than 100 gives an Error" {
        withClue("Mark=-1") { grade(-1) shouldBe "?" }
        withClue("Mark=-20") { grade(-20) shouldBe "?" }
        withClue("Mark=101") { grade(101) shouldBe "?" }
        withClue("Mark=120") { grade(120) shouldBe "?" }
    }
})