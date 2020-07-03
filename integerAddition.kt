// There is a three-digit integer (i.e. an integer from 100 to 999). Find the sum of its digits.

// Sample Input 1:

// 476
// Sample Output 1:

// 17

import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    var sum: Int = 0
    var digit = scanner.nextInt()
    while (digit != 0) { 
        sum += digit % 10
        digit = digit / 10
    }
    print(sum)
}
