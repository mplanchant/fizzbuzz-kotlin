package uk.co.logiccache

object Fizzbuzz {

    fun of(range: IntProgression): List<String> {
        check(range.first > 0) { "Argument start was ${range.first} but expected to be greater than zero" }
        check(range.last >= range.first) { "Argument end was ${range.last} but expected to be greater than or equal to ${range.first}" }
        return range.map { of(it) }
    }

    private fun of(number: Int): String {
        return when {
            number.divisibleBy(15) -> "Fizzbuzz"
            number.divisibleBy(3) -> "Fizz"
            number.divisibleBy(5) -> "Buzz"
            else -> number.toString()
        }
    }

    private fun Int.divisibleBy(x: Int) = this % x == 0
}