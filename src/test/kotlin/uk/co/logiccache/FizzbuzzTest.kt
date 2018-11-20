package uk.co.logiccache

import io.kotlintest.matchers.startWith
import io.kotlintest.should
import io.kotlintest.shouldBe
import io.kotlintest.shouldThrow
import io.kotlintest.specs.StringSpec

class FizzbuzzTest : StringSpec({

    "start value of 0" {
        val exception = shouldThrow<IllegalStateException> { Fizzbuzz.of(0..10) }
        exception.message should startWith("Check failed.")
    }

    "start value less than 0" {
        val exception = shouldThrow<IllegalStateException> { Fizzbuzz.of(-1..0) }
        exception.message should startWith("Check failed.")
    }

    "finish value less than start value" {
        val exception = shouldThrow<IllegalStateException> { Fizzbuzz.of(10 downTo 0) }
        exception.message should startWith("Check failed.")
    }

    "fizzbuzz of 1" {
        Fizzbuzz.of(1..1) shouldBe listOf("1")
    }

    "fizzbuzz of 1 to 3" {
        Fizzbuzz.of(1..3) shouldBe listOf("1", "2", "fizz")
    }

    "fizzbuzz of 1 to 5" {
        Fizzbuzz.of(1..5) shouldBe listOf("1", "2", "fizz", "4", "buzz")
    }

    "fizzbuzz of 1 to 15" {
        Fizzbuzz.of(1..15) shouldBe listOf(
            "1",
            "2",
            "fizz",
            "4",
            "buzz",
            "fizz",
            "7",
            "8",
            "fizz",
            "buzz",
            "11",
            "fizz",
            "13",
            "14",
            "fizzbuzz"
        )
    }

    "fizzbuzz of 10 to 15" {
        Fizzbuzz.of(10..15) shouldBe listOf("buzz", "11", "fizz", "13", "14", "fizzbuzz")
    }

    "fizzbuzz of 1 to 20" {
        Fizzbuzz.of(1..20) shouldBe listOf(
            "1",
            "2",
            "fizz",
            "4",
            "buzz",
            "fizz",
            "7",
            "8",
            "fizz",
            "buzz",
            "11",
            "fizz",
            "13",
            "14",
            "fizzbuzz",
            "16",
            "17",
            "fizz",
            "19",
            "buzz"
        )
    }
})