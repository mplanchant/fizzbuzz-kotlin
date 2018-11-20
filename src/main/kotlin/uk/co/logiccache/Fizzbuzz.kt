package uk.co.logiccache

object Fizzbuzz {

    fun of(range: IntProgression): List<String> {
        check(range.first > 0)
        check(range.last >= range.first)
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