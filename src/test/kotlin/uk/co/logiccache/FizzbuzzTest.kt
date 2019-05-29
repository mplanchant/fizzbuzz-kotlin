package uk.co.logiccache

import io.kotlintest.matchers.startWith
import io.kotlintest.should
import io.kotlintest.shouldBe
import io.kotlintest.shouldThrow
import io.kotlintest.specs.StringSpec

class FizzbuzzTest : StringSpec({

    "start value of 0" {
        val exception = shouldThrow<IllegalStateException> { fizzbuzz(0..10) }
        exception.message should startWith("Start of range expected to be greater than zero but was 0")
    }

    "start value less than 0" {
        val exception = shouldThrow<IllegalStateException> { fizzbuzz(-1..0) }
        exception.message should startWith("Start of range expected to be greater than zero but was -1")
    }

    "finish value less than start value" {
        val exception = shouldThrow<IllegalStateException> { fizzbuzz(10 downTo 0) }
        exception.message should startWith("End of range was 0 but expected to be greater than or equal to 10")
    }

    "Fizzbuzz of 1" {
        fizzbuzz(1..1) shouldBe listOf("1")
    }

    "Fizzbuzz of 1 to 3" {
        fizzbuzz(1..3) shouldBe listOf("1", "2", "Fizz")
    }

    "Fizzbuzz of 1 to 5" {
        fizzbuzz(1..5) shouldBe listOf("1", "2", "Fizz", "4", "Buzz")
    }

    "Fizzbuzz of 1 to 15" {
        fizzbuzz(1..15) shouldBe listOf(
            "1",
            "2",
            "Fizz",
            "4",
            "Buzz",
            "Fizz",
            "7",
            "8",
            "Fizz",
            "Buzz",
            "11",
            "Fizz",
            "13",
            "14",
            "Fizzbuzz"
        )
    }

    "Fizzbuzz of 10 to 15" {
        fizzbuzz(10..15) shouldBe listOf("Buzz", "11", "Fizz", "13", "14", "Fizzbuzz")
    }

    "Fizzbuzz of 1 to 20" {
        fizzbuzz(1..20) shouldBe listOf(
            "1",
            "2",
            "Fizz",
            "4",
            "Buzz",
            "Fizz",
            "7",
            "8",
            "Fizz",
            "Buzz",
            "11",
            "Fizz",
            "13",
            "14",
            "Fizzbuzz",
            "16",
            "17",
            "Fizz",
            "19",
            "Buzz"
        )
    }
})