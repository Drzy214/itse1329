//Andrew Ruano, 4.1, 9/20/2022


package week5
fun main(){
    println("Enter a whole number: ")
    var value = Integer.valueOf(readLine())
    var sum = 0
    var i = 0
    var limit = value

    for (i in 0 until limit ) {
        sum += i
        println(sum)
    }

}
