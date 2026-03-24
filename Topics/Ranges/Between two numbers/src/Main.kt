import java.util.Scanner

fun main() {
    // write your code here
    Scanner(System.`in`).use {
        val number = it.nextInt()
        val range = it.nextInt()..it.nextInt()

        print(number in range)
    }
}