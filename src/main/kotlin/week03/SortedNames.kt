package week03

fun main() {
    println("Enter a name: ")
    var first = readLine()!!
    println("Enter another name: ")
    var second = readLine()!!
    println("Enter another name: ")
    var third = readLine()!!


    if (first > second) {
        var temporary = first
        first = second
        second = temporary
    }
        if (second > third) {
            var temporary = second
            second = third
            third = temporary
        }
        if (first > second) {
            var temporary = first
            first = second
            second = temporary
        }
        println(first)
        println(second)
        println(third)
    }



