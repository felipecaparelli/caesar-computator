package com.caparelli

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class RomanConverterTest {

    @Test
    fun testIntToRoman() {
        assertEquals("XX", RomanConverter().intToRoman(20))
        assertEquals("V", RomanConverter().intToRoman(5))
        assertEquals("L", RomanConverter().intToRoman(50))
    }

    @Test
    fun testIntToRomanInvalidInput() {
        assertEquals("", RomanConverter().intToRoman(-1))
    }
}
