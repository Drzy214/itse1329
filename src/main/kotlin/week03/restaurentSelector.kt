package week03

fun main(){
    println("Is anyone in your party vegetarian?")
    var vegetarian = readLine()!!
    println("Is anyone in your party vegan?")
    var vegan = readLine()!!
    println("Is anyone in your party gluten-free?")
    var glutenFree = readLine()!!

    if(vegetarian == "yes" && vegan == "yes" && glutenFree == "yes") {
        println("Here are your restaurant choices: ")
        println("Corner Cafe")
        println("The Chef's Kitchen")
    }
    if(vegetarian == "yes" && vegan == "no" && glutenFree == "yes") {

        println("Here are your restaurant choices: ")
        println("Main Street Pizza Company")
    }
    if(vegetarian == "yes" && vegan == "no" && glutenFree == "no") {
        println("Here are your restaurant choices: ")
        println("Mama's Fine Italian")
    }
    if(vegetarian == "no" && vegan == "no" && glutenFree == "no") {
        println("Joe's Gourmet Burgers")
    }

}