import java.util.Scanner

fun countTables(group: Int): Int {
    return if(group % 2 == 0) group / 2 else group / 2 + 1
}

fun main() {
    // put your code here
    Scanner(System.`in`).use {
        val group1 = it.nextInt()
        val group2 = it.nextInt()
        val group3 = it.nextInt()

        print(countTables(group1) + countTables(group2) + countTables(group3))
    }
}