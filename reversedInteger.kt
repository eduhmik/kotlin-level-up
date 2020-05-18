// Write a program that reads a three-digit number, reverses the order of its digits, and outputs a new number.

// Sample Input 1:

// 862
// Sample Output 1:

// 268

import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    var num = scanner.nextLine().toInt()
    var reversedNum: Int = 0
    while (num != 0) {
        val digit = num % 10
        reversedNum = reversedNum * 10 + digit
        num /= 10
    }
    println(reversedNum)
}