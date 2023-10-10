package com.caparelli

/**
 * Launch point.
 */
fun main() {
    // The application will wait for the user input
    print("Enter an integer or a Roman numeral: ")
    // Print the expected result (Roman Numeral or Integer number)
    println(convertToRomanOrInteger(readLine()))
}

fun convertToRomanOrInteger(input: String?): String {
    // If the input is null, throw the exception, otherwise get the input parameter
    requireNotNull(input) { "Invalid input (null). Please enter a valid integer or a Roman numeral." }
    val converter = RomanConverter()
    return if (converter.isRomanNumeral(input)) {
        // Input is a valid Roman numeral, returns the expected integer number
        "$input in integer form is: ${converter.romanToInt(input)}"
    } else if (isPositiveInteger(input)) {
        // Input is a valid integer, returns the expected Roman numeral
        "$input in Roman numerals is: ${converter.intToRoman(input.toInt())}"
    } else {
        // Invalid input, throws the exception
        throw IllegalArgumentException("Invalid input. Please enter a valid integer or a Roman numeral.")
    }
}


/**
 * Check if the received input is a valid positive Integer.
 */
fun isPositiveInteger(input: String): Boolean {
    return try {
        val number = input.toInt()
        number > 0
    } catch (e: NumberFormatException) {
        false
    }
}
