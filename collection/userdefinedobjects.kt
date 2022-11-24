package collection

/*class Product(id:Int,name:String,price:Double)
{
    var id:Int=id
    var name:String=name
    var price:Double=price
}

fun main() {

    var products = mutableListOf<Product>()
    products.add (Product(1,"laptop",56000.50))
    products.add(Product(2,"mobile",87000.50))
    products.add(Product(3,"shirt",4000.20))

    for (product in products)
        println("${product.id} ${product.name} ${product.price}")

}*/



class Employee(id:Int,name:String,salary:Double,dept:String)
{
    var id:Int=id
    var name:String=name
    var salary:Double=salary
    var dept:String=dept
}

fun main() {

    var employees = mutableListOf<Employee>()
    employees.add (Employee(121, "jai",  30000.45, "hr"))
    employees.add (Employee(191,"shelly",  20000.45, "reception"))
    employees.add (Employee(167, "bosco",  45000.45, "manager"))

    for (employee in employees)
        println("${employee.id} ${employee.name} ${employee.salary} ${employee.dept}")

}

