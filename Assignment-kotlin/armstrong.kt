// armstrong number

fun main(args: Array<String>) {
    val num = 1234
    var originalNum: Int
    var remainder: Int
    var result = 0
    var n = 0

    originalNum = num

    while(originalNum != 0){
        originalNum /= 10
        ++n
    }

    originalNum = num

    while(originalNum != 0) {
        remainder = originalNum % 10
        result += Math.pow(remainder.toDouble(), n.toDouble()).toInt()
        originalNum /= 10
    }

    if(result == num)
        println("$num is a armstrong number.")
    else
        println("$num is not a armstrong number.")
}