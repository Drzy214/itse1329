package week04
//Andrew Ruano,randomNumberGuessingGame.kt 4.5,9-25-2022
import kotlin.random.Random;
fun main(){
    var randomNumber = (0..20).random()
    println("Guess a number between 0-20: ")
    var userGuess = Integer.valueOf(readLine())
    var i =0
    while(i in 0 until  10) {
        if (userGuess > randomNumber) {
            println("Too high try again!")
            println("Guess a number between 0-20: ")
            userGuess = Integer.valueOf(readLine())
        } else {
            println("Too low, try again!")
            println("Guess a number between 0-20: ")
            userGuess = Integer.valueOf(readLine())
            i++
        }
        if (userGuess == randomNumber) {
            println("You was right!")
            break
        }
    }
}
