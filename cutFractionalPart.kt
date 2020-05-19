// Write a program that cuts the fractional part of a number.

// Use Double as the input type and Long as the result type since a value can be quite large.

// Sample Input 1:

// 5.44
// Sample Output 1:

// 5

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here
    val output = scanner.nextLine()
    var num: Double
    num = output.toDouble()
    println(num.toLong())
}

// Hint

// val istr1 = "42"
//   val int1: Int? = istr1.toInt()
//   println(int1)
  // 42

//   val istr2 = "42.1"
//   val int2: Int? = istr2.toInt()
  // Exception in thread "main" java.lang.NumberFormatException: For input string: "42.1"