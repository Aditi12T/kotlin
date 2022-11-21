//with temporary variable
fun main(args: Array<String>) {
    var a = 4
    var b = 7

    println("swapping using a temporary variable")

    val temp = a
    a = b
    b = temp

    println("$a")
    println("$b")

}



//without using temporary variable
/*fun main() {
    var a = 78
    var b = 43

    println("Swapping without using temporary variable")

    a = a - b
    b = a + b
    a = b - a

    println("$a")
    println("$b")
}*/