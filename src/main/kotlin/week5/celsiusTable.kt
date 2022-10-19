package week5
fun main() {
    for (i in 0 until 21) {
        print(i)
        println(" In celsius is: " + celsius(i))
    }
}
fun celsius(fahrenheit: Int): Double {
    return (fahrenheit-32) / 1.8000
}