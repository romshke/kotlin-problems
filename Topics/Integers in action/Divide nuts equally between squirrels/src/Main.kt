import java.util.Scanner

fun main() {
    // put your code here
    Scanner(System.`in`).use {
        val n = it.nextInt()
        val k = it.nextInt()

        print(k / n)
    }
}