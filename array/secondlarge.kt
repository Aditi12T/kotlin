package array

fun main(args: Array<String>) {
    val arr = arrayOf(7,3,9,2,4,1,5)

    println("Numbers: ${Arrays.toString(arr)}")

    var first = Int.MIN_VALUE
    var second = Int.MIN_VALUE

    for(n in arr) {
        if(n > first) {
            second = first
            first = n

        }
        else if(n != first && n > second) {
            second = n

        }
        println("first: ${first}")
        println("second: ${second}")
    }

}