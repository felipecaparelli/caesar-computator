package com.caparelli

import org.junit.jupiter.api.Test

import kotlin.test.assertFailsWith

internal class MainKtTest {

    @Test
    fun convertIntToRomanWhenParamIsNull() {
        assertFailsWith<IllegalArgumentException>(
            message = "Invalid input (null). Please enter a valid integer.",
            block = {
                convertIntToRoman(null)
            }
        )
    }

    @Test
    fun convertIntToRomanWhenParamIsInvalid() {
        assertFailsWith<IllegalArgumentException>(
            message = "Invalid input. Please enter a valid integer.",
            block = {
                convertIntToRoman("AA")
            }
        )
    }
}
