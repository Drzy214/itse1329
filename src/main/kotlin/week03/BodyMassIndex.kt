package week03
fun main() {
    println("Enter weight(lb): ")
    var weight = Integer.valueOf(readLine())
    println("Enter height(inches): ")
    var height = Integer.valueOf(readLine())
    var bmi = ((weight + 0.25) / height / height) * 703
    if((bmi >= 18.5) && (bmi <=25))
        println("Optimal weight!")
    if(bmi <= 18.5)
        println("Underweight!")
    if(bmi >= 25)
        println("Overweight!")



}
