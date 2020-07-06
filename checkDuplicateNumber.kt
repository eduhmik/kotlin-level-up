// Write a program that reads numbers and checks if they all are different (i.e. no number equals to any other).

// The program is to output true or false.

// Sample Input 1:

// 5 5 9
// Sample Output 1:

// false
// Sample Input 2:

// 1 2 3
// Sample Output 2:

// true

import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val numList = ArrayList<Int>()
    while (scanner.hasNext()) {
        numList.add(scanner.nextInt())
    } 
    isValid(numList)
}

fun isValid(numList: ArrayList<Int>): Boolean {
    var ans: Boolean = false 
    loop@ for (i in 0..numList.size - 1) {
        for (j in 0..numList.size - 1) {
            if (i != j) {
                if (numList[i] == numList[j]) {
                    ans = false
                    print(ans)
                    break@loop
                }
            }
        }
        if (i == numList.size - 1) {
            ans = true
            print(ans)
        }
    } 
    return ans
}