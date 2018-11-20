package uk.co.logiccache

object Fizzbuzz {
    private const val FIZZ = "fizz"
    private const val BUZZ = "buzz"

    fun of(range: IntProgression): List<String> {
        check(range.first > 0)
        check(range.last >= range.first)
        return range.map { of(it) }
    }

    private fun of(number: Int): String {
        val builder = StringBuilder()
        if (divisibleByThree(number)) builder.append(FIZZ)
        if (divisibleByFive(number)) builder.append(BUZZ)
        if (builder.isEmpty()) builder.append(number)
        return builder.toString()
    }

    private fun divisibleByThree(number: Int): Boolean {
        return number % 3 == 0
    }

    private fun divisibleByFive(number: Int): Boolean {
        return number % 5 == 0
    }
}