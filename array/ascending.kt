package array
//ascending

fun main(args: Array<String>) {
    val arr = arrayOf(7,3,9,2,4,1,5)
    arr.sort()
    for(n in arr)
        print("$n ")
}
