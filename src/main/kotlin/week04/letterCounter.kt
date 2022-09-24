package week04
//Andrew Ruano, 4.2 Letter Counter, 9-24-2022

fun main(args: Array<String>) {
    println("Enter a string:")
    val string = readLine()!!
    println("Enter a character: ")
    val ch = readLine()!!
    println(letterCounter(string,'a'))
}
fun letterCounter(string: String, ch: Char): Int {
    var counter = 0
    for (c in string)
    {
        if (c == ch) {
            counter++
        }
    }
    return counter
}





