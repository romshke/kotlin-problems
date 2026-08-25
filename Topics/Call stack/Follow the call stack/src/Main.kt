fun printIfPrime(number: Int) {
    // write here
    if (number == 1) {
        print("$number is not a prime number.")
        return
    }

    for (i in 2..<number) {
        if (number % i == 0) {
            print("$number is not a prime number.")
            return
        }
    }

    print("$number is a prime number.")
}

fun main(args: Array<String>) {
    // write here
    printIfPrime(readln().toInt())
}