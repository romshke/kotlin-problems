import java.util.Scanner

fun main() {
    // put your code here
    Scanner(System.`in`).use {
        val a = it.nextInt()
        val b = it.nextInt()
        val c = it.nextInt()

        print(a + b == 20 || a + c == 20 || b + c == 20)
    }
}