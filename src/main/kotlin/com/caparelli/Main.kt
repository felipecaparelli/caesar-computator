package com.caparelli

/**
 * Launch point.
 */
fun main() {
    // 1. The application will wait for the user input
    print("Enter an integer: ")
    convertIntToRoman(readLine())
}

/**
 * Function responsible for reading the user input and to valid it.
 */
fun convertIntToRoman(input: String?) {
    try {
        // 2. Get the expected input (an Integer value)
        val num = input?.toInt()
        if (num != null) {
            // 3. If the parameter is valid, use the converted
            val romanNumeral = RomanConverter().intToRoman(num)
            // 4. Print the expected message
            println("$num in Roman numerals is: $romanNumeral")
        } else {
            // 3.1. If the input parameter is null, show the following message
            throw IllegalArgumentException("Invalid input (null). Please enter a valid integer.")
        }
    } catch (e: NumberFormatException) {
        // 2.1. If the input parameter is invalid, show the following message
        throw IllegalArgumentException("Invalid input. Please enter a valid integer.")
    }
}
