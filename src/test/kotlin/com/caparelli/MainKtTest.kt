package com.caparelli

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

import kotlin.test.assertFailsWith

internal class MainKtTest {

    @Test
    fun convertIntToRoman() {
        assertEquals("54 in Roman numerals is: LIV", convertToRomanOrInteger("54"))
        assertEquals("129 in Roman numerals is: CXXIX", convertToRomanOrInteger("129"))
        assertEquals("587 in Roman numerals is: DLXXXVII", convertToRomanOrInteger("587"))
        assertEquals("3000 in Roman numerals is: MMM", convertToRomanOrInteger("3000"))
    }

    @Test
    fun convertRomanToInt() {
        assertEquals("V in integer form is: 5", convertToRomanOrInteger("V"))
        assertEquals("XXIII in integer form is: 23", convertToRomanOrInteger("XXIII"))
        assertEquals("MCMLXXXII in integer form is: 1982", convertToRomanOrInteger("MCMLXXXII"))
    }

    @Test
    fun convertIntToRomanWhenParamIsEmpty() {
        assertFailsWith<IllegalArgumentException> {
            convertToRomanOrInteger(null)
        }
    }

    @Test
    fun convertIntToRomanWhenParamIsInvalid() {
        assertFailsWith<IllegalArgumentException> {
            convertToRomanOrInteger("DAX")
        }
    }

    @Test
    fun convertIntToRomanWhenParamIsInvalid2() {
        assertFailsWith<IllegalArgumentException> {
            convertToRomanOrInteger("**")
        }
    }

    @Test
    fun convertIntToRomanWhenParamIsInvalidInteger() {
        assertFailsWith<IllegalArgumentException> {
            convertToRomanOrInteger("-10")
        }
    }

}
