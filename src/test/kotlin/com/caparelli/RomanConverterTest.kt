package com.caparelli

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

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

    @Test
    fun testRomanToInt() {
        assertEquals(4, RomanConverter().romanToInt("IV"))
        assertEquals(6, RomanConverter().romanToInt("VI"))
        assertEquals(9, RomanConverter().romanToInt("IX"))
        assertEquals(12, RomanConverter().romanToInt("XII"))
    }

    @Test
    fun isRomanNumeral() {
        assertTrue(RomanConverter().isRomanNumeral("XVI"))
        assertTrue(RomanConverter().isRomanNumeral("D"))
    }
}
