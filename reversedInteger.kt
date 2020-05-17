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