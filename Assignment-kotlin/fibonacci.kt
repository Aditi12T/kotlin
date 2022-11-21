//print fibonacci series

fun main(args: Array<String>) {
    var i = 1
    val n = 10
    var t1 = 0
    var t2 = 1

    print("first $n terms: ")

    //for (i in 1..n)
    while (i <= n) {
        print("$t1 + ")

        val sum = t1 + t2
        t1 = t2
        t2 = sum

        i++
    }
}