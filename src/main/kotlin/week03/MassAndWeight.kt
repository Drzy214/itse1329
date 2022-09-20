package week03
fun main(){
    println("Enter mass(kg): ")
    var mass = Integer.valueOf(readLine())
    var weight = (mass * 9.8)
    if(weight > 1000)
        println("Too heavy!")
    if (weight < 10)
        println("Too, light!")
    println("Weight is: " + weight)
}
