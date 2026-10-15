// Task 6.3: unit tests for grade()

import kotlin.test.Test
import kotlin.test.assertEquals

class GradeTest {
    @Test
    fun `A mark between 70 and 100 gives a grade of Distinction`() {
        assertEquals("Distinction", grade(70), "mark=70")
        assertEquals("Distinction", grade(85), "mark=85")
        assertEquals("Distinction", grade(100), "mark=100")
    }

    @Test
    fun `A mark between 40 and 69 gives a grade of Pass`() {
        assertEquals("Pass", grade(40), "mark=40")
        assertEquals("Pass", grade(55), "mark=55")
        assertEquals("Pass", grade(69), "mark=69")
    }

    @Test
    fun `A mark between 0 and 39 gives a grade of Fail`() {
        assertEquals("Fail", grade(0), "mark=0")
        assertEquals("Fail", grade(20), "mark=20")
        assertEquals("Fail", grade(39), "mark=39")
    }

    @Test
    fun `A mark less than 0 or greater than 100 gives an error`() {
        assertEquals("?", grade(-1), "mark=-1")
        assertEquals("?", grade(-20), "mark=-20")
        assertEquals("?", grade(101), "mark=101")
        assertEquals("?", grade(120), "mark=120")
    }
}
