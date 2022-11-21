//check whether the number is palindrome or not

fun main(args: Array<String>) {
    var num = 121
    var reversedInt = 0
    var remainder: Int
    val originalInt: Int

    originalInt = num

    while(num != 0) {
        remainder = num % 10
        reversedInt = reversedInt * 10 + remainder
        num /= 10
    }
    if (originalInt == reversedInt)
        println("$originalInt is a palindrome.")
    else
        println("$originalInt is not a palindrome.")

}