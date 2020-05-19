// Write a method named divide that takes two long numbers and returns a double value. It is to return the result of the division of the first argument by the second one. It's guaranteed that the second argument is not zero.

// Sample Input 1:

// 500000000000 200000000000
// Sample Output 1:

// 2.5

import java.util.*

// write your code here
fun divide(num1: Long, num2: Long): Double {
    var output: Double
    output = num1.toDouble() / num2.toDouble()
    return output
}

/* Do not change code below */
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextLong()
    val b = scanner.nextLong()
    println(divide(a, b))
}

// Functions are declared with the fun keyword. For the parameters, you must declare not only their names, but also their types, and you must declare the type of the value the function is intending to return. The body of the function is usually a block, which is enclosed in curly braces:

fun happyBirthday(name: String, age: Int): String {
    return "Happy ${age}th birthday, $name!"
}
// Here, name must be a string, age must be an integer, and the function must return a string. However, you can also make a oneliner function, where the body simply is the expression whose result is to be returned. In that case, the return type is inferred, and an equals sign is used to indicate that it's a oneliner:

fun square(number: Int) = number * number
// (Note that there is no ** operator; non-square exponentiation should be done via Math.pow().)

// Function names should use lowerCamelCase instead of snake_case.

// Functions are called the same way as in Python:

val greeting = happyBirthday("Anne", 32)
// If you don't care about the return value, you don't need to assign it to anything.

