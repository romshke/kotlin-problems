fun main() {
    // write your code here
    val n = readln().toInt()
    var first = readln().toInt()

    for (i in 1..<n) {
        val second = readln().toInt()

        if (second < first) {
            println("NO")
            return
        }

        first = second
    }

    println("YES")
}