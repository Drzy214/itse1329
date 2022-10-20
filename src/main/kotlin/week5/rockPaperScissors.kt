package week5
fun main(){
    println("choose 1.rock, 2.paper, 3.scissors")
    var choice =  Integer.valueOf(readLine())
    println("The computer chose: ")
    println(computersChoice())
    while(choice == computersChoice()) {
        println("It's a draw, Play Again!")
        choice = Integer.valueOf(readLine())
    }
    if(choice < computersChoice()) {
        println("Computer Victory!")
    }
    else{
        println("User Victory!")
    }
    if(computersChoice() == 3 && choice == 1)
        println("User Victory!")
}
fun computersChoice(): Int{
    var randomNum = (1 until 3).random()
    if(randomNum == 1)
        return 1
    if(randomNum == 2)
        return 2
    if(randomNum == 3)
        return 3
    return 0
}
