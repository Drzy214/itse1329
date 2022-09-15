package week03

fun main(){
    println("Enter a number between 1 through 10 ")
    var userinput = Integer.valueOf(readLine())
    val result = when(userinput){
        1 -> "I"
        2 -> "II"
        3 -> "III"
        4 -> "IV"
        5 -> "V"
        6 -> "VI"
        7 -> "VII"
        8 -> "VIII"
        9 -> "IX"
        10 -> "X"
        else -> "Invalid number "
    }
println(result)

    }
