package week04

fun main(){
    val rounds = (0..10).random()
    print("Your guess: ")
    val guess = Integer.valueOf(readLine())
    println("My number: " + rounds)
    print("Your guess: " + guess)

    if (guess < rounds){
        println(" Your guess is too low, try again")
    }
    if (guess > rounds){
        println(" Your guess is too high")
    }
}