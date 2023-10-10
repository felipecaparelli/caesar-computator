package com.caparelli

val INT_VALUES = intArrayOf(1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1)
val ROMAN_SYMBOLS = arrayOf("M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I")

/**
 * Class responsible for the numeral conversions.
 * @author felipecaparelli
 */
class RomanConverter {

    /**
     * Convert the Integer number to a Roman numeral
     *
     * @param num - Integer value
     *
     * @return a Roman numeral correspondent to the Integer number (String)
     */
    fun intToRoman(num: Int): String {
        var result = ""
        var number = num
        for (i in INT_VALUES.indices) {
            while (number >= INT_VALUES[i]) {
                result += ROMAN_SYMBOLS[i]
                number -= INT_VALUES[i]
            }
        }
        return result
    }
}
