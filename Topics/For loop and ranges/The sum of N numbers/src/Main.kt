fun main() {
    // write your code here
    val n = readln().toInt()
    var sum = 0

    for (i in 0..<n) {
        sum += readln().toInt()
    }

    println(sum)
}