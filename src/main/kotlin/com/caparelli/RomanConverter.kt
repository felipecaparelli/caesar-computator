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
            // 3. If input number is < the highest Roman numeral, then check with next highest Roman numerals
            while (number >= INT_VALUES[i]) {
                // 1. If input number is >= the highest Roman numeral, add it to the string and reduce its corresponding value from the input number
                result += ROMAN_SYMBOLS[i]
                // 2. Subtract the current int value from the input number
                number -= INT_VALUES[i]
            }
            // 4. Repeat the process above until the input number becomes 0
        }
        return result
    }
}
