package com.oops

fun main(args: Array<String>) {
     var car= Car("2018","red",500000,120789)
    car.displayCarInfo()

    println(car.checkCarStatus())
}
class Car {
    var modelNo:String=""
    var color:String=""
    var price:Int=0
    var kmDriven=0

    constructor(modelNo:String,color:String,price:Int,kmDriven:Int)
    {
        this.modelNo=modelNo
        this.color=color
        this.price=price
        this.kmDriven=kmDriven
    }

    fun checkCarStatus():String
    {
        if(kmDriven <= 5000)
            return "car is new condition"
        else if(kmDriven>5000 && kmDriven<=20000)
            return "car is in good condition"
        return "car is old"
    }
    fun displayCarInfo()
    {
        println("$modelNo $price $color $kmDriven")
    }
}



//=========example of classes and objects- employee=========

fun main(args: Array<String>) {

    var employee=Employee(2,"sachin")
    employee.displayEmployeeInfo()
}


class Employee(id:Int=1,name:String="",dept:String="bench")
{
    var id:Int=id
    var name:String=name
    var dept:String=dept

    fun displayEmployeeInfo()
    {
        println("$id $name $dept")
    }
}


//example-2

fun main(args: Array<String>) {
    var employee=Employee(2,"sachin")
    employee.displayEmployeeInfo()
    var employee2=Employee(4, dept = "developer")
    employee2.displayEmployeeInfo()
}
class Employee(id:Int=1,name:String="",dept:String="bench")
{
    var id:Int=id
    var name:String=name
    var dept:String=dept
    fun displayEmployeeInfo()
    {
        println("$id $name $dept")
    }
}