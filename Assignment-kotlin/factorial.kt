// get a factorial of a number

fun main(args: Array<String>) {
    val num = 8
    var fact: Long = 1

    for(i in 1..num){
        //fact = fact * i
        fact *= i.toLong()
    }
    println("factorial of $num = $fact")

}