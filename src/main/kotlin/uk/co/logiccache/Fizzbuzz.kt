package uk.co.logiccache

fun fizzbuzz(range: IntProgression): List<String> {
    check(range.first > 0) { "Start of range expected to be greater than zero but was ${range.first}" }
    check(range.last >= range.first) { "End of range was ${range.last} but expected to be greater than or equal to ${range.first}" }
    return range.map { fizzbuzz(it) }
}

private fun fizzbuzz(number: Int): String {
    return when {
        number.divisibleBy(15) -> "Fizzbuzz"
        number.divisibleBy(3) -> "Fizz"
        number.divisibleBy(5) -> "Buzz"
        else -> number.toString()
    }
}

private fun Int.divisibleBy(x: Int) = this % x == 0