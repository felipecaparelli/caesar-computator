package com.caparelli

val INT_VALUES = intArrayOf(1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1)
val ROMAN_SYMBOLS = arrayOf("M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I")

/**
 * Class responsible for the numeral conversions.
 * @author felipecaparelli
 */
class RomanConverter {

    /**
     * Check if the input value is a valid Roman numeral
     */
    fun isRomanNumeral(input: String): Boolean {
        return "^(M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3}))$".toRegex().matches(input)
    }

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

    /**
     * Receives a Roman numeral and convert to an Integer number.
     *
     * @param roman - String value representing a Roman numeral
     *
     * @return an Integer value
     */
    fun romanToInt(roman: String): Int {
        val romanToNumber = mapOf(
            'I' to 1,
            'V' to 5,
            'X' to 10,
            'L' to 50,
            'C' to 100,
            'D' to 500,
            'M' to 1000
        )

        var result = 0
        var prevValue = 0

        for (i in roman.length - 1 downTo 0) {
            val currentChar = roman[i]
            val currentValue = romanToNumber[currentChar] ?: 0
            if (currentValue < prevValue) {
                result -= currentValue
            } else {
                result += currentValue
            }
            prevValue = currentValue
        }

        return result
    }
}
