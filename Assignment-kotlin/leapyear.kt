//check the given year is leap or not

/*fun main(args: Array<String>) {
    val y: Int
    y = parseInt(args[0]);

    if(y % 100 == 0) {
        if(y % 400 == 0) {
            println("It is a leap year.")
        }
        else {
            println("It is not a leap year.")
        }
        else if(y % 4 == 0) {
            println("It is a leap year.")
        }
        else {
            println("It is not a leap year.")
        }

    }
}*/



fun main() {
    val year = 2017
    var leap = false

    if(year % 100 == 0) {
        if(year % 400 == 0){
            leap = year % 400 == 0
        }
        else
            leap = true
    }
    else
        leap = false

    println(if (leap) "$year is a leap year." else "$year is not a leap year." )
}
