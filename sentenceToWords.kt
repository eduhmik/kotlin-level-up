import java.util.Scanner
import java.io.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.in)
    val firstList: MutableList<String> = ArrayList<String>()
    while (scanner.hasNext()) {
        firstList += scanner.next().split("\\s")
    }
    for (word in firstList) {
        println(word)
    }
    scanner.close()
}