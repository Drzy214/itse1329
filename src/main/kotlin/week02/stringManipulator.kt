fun main(args: Array<String>){
    //user enters favorite city
    println("Enter your favorite city:")
    val city: String = readLine()!!
    //displays the city in different ways
    println("Number of characters in your city: " + city.length)
    println("The name of your city in all caps: " + city.uppercase())
    println("The name of your city in all lower case: " + city.lowercase())
    println("The first letter of your city: " + city.first())
}
