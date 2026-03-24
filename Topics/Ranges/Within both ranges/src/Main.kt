import java.util.Scanner

fun main() {
    // write your code here
    Scanner(System.`in`).use {
        val range1 = it.nextInt()..it.nextInt()
        val range2 = it.nextInt()..it.nextInt()
        val number = it.nextInt()

        print(number in range1 && number in range2)
    }
}
