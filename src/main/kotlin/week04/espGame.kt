package week04
//Andrew Ruano, espGame.kt 4.6, 9-26-2022
fun main() {
    val colors = arrayOf("blue","red","yellow","brown","black")

    var count = 0
    for(i in 1 until 10){
        val randomNumber = (Math.random()*5).toInt()
        val computerNumber = colors[randomNumber]
        println("Guess a number: ")
        val playerGuess = readLine()!!
        println("The color was $computerNumber")

        if(playerGuess.equals(computerNumber, ignoreCase = true)){
            count += 1
        }
    }
    println("The user correctly guessed the color $count number of times.")
}
