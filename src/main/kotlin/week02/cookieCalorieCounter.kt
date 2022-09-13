fun main(args: Array<String>){
    //initializing the variables
    val cookiesInBag: Int = 40
    val servingInABag = 10
    val cookiesPerServing = (cookiesInBag/servingInABag);
    val caloriesPerServing = 300
    val caloriesPerCookie = caloriesPerServing / cookiesPerServing;
    //Prompts user to input number of cookies
    println(" Enter number of cookies eaten: ")
    //converts the string value into an integer
    val cookie = Integer.valueOf(readLine())
    val totalCal = caloriesPerCookie * cookie;
    //outputs calories consumed
    println(" calories consumed: $totalCal")

}
