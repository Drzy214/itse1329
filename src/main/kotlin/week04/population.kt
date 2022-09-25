//Andrew Ruano, population.kt 4.3, 9-25-2022
fun main(){

    println("Please enter the population of wolfs in Texas: ")
    var wolfs = readLine()!!.toDouble()
    while(wolfs < 2){
        println("Please enter a quantity more than 2")
        wolfs = readLine()!!.toDouble()
    }
    println("Please enter the daily percentage increase of wolfs in Texas: ")
    val percIncrease = readLine()!!.toDouble() / 100
    println("How many days will the wolf population multiply: ")
    val dayIncrease = Integer.valueOf(readLine())
    for (i in 0 until dayIncrease){
        wolfs *= (percIncrease + 1)
    }
    println("The amount of wolfs in Texas has increased to $wolfs in $dayIncrease days.")
}