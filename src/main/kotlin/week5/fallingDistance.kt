package week5
fun main(){
for(i in 1 until 10) {
    println(fallingDistance(i))
    }
}
fun fallingDistance(time: Int): Double {
    return 0.5 * (9.8 * Math.pow(time.toDouble(), 2.0))

}
