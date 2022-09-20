package week03

fun main() {
    println("Enter a month: ")
    var month = Integer.valueOf(readLine())
    println("Enter a day: ")
    var day = Integer.valueOf(readLine())
    println("Enter a two-digit year ")
    var year = Integer.valueOf(readLine())
    var value = day * month
    if(value == year)
        println("The date is Magic ")
    if(value != year)
        println("The date is not Magic")

}