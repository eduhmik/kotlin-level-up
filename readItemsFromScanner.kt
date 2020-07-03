completion was 37 minutes ago.
// Write a program that reads five words from the standard input and outputs each word in a new line.

// The words can be placed in the input stream in any way.

// To solve the problem, use Scanner .

// Sample Input 1:

// This course
// teach you Kotlin
// Sample Output 1:

// This
// course
// teach
// you
// Kotlin
// Sample Input 2:

// one two three four five
// Sample Output 2:

// one
// two
// three
// four
// five

import java.util.Scanner
import java.io.*
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val firstList: MutableList<String> = ArrayList<String>()
    while (scanner.hasNext()) {
        firstList += scanner.next().split("\\s")
    }
    for (word in firstList) {
        println(word)
    }
    scanner.close()
}