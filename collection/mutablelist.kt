package collection

/*fun main() {

    var marks = mutableListOf<Int>(20,30,40,20)
    println(marks)

    println()

    marks.add(50)
    marks.add(34)

    println(marks)
    println("size${marks.size}")
    println(marks[0])
    println("first marks  ${marks.first()}")
    println("last marks  ${marks.last()}")
    println("contains 20 ${marks.contains(20)}")
    marks.remove(2)
    println(marks)
    marks.clear()


}*/



//example- mutable list of fruits.

/*fun main() {

    var fruits = mutableListOf<String>("apple","mango","banana","kiwi")
    println(fruits)

    fruits.add("orange")
    fruits.add("grapes")

    println(fruits)
}*/



//example of add() and addall()

fun main() {

    var num1 = mutableListOf<Int>(1,2,3,4,5)
    var num2 = mutableListOf<Int>(6,4,8,9,0)

    println(num1)
    println(num2)

    num2.remove(4)
    num1.add(10)
    num2.addAll(num1)
    println("after adding $num2")
    num1.retainAll(num2)
    println("after retaining $num1")
    num1.sort()
    println("after sorting")
    println(num1)
}

