import java.util.Scanner

fun main() {
    // put your code here
    Scanner(System.`in`).use {
        val first = it.nextInt()
        val second = it.nextInt()
        val third = it.nextInt()

        print(
            if (second < third)
                first in second..third
            else
                first in third..second
        )
    }
}