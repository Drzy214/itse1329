package week03
//******
//Andrew Ruano, 3.6 Running the Race, 9-22-2022
//*****
fun main(){
    println("Enter name of runner 1")
    var runner1 = readLine()!!
    println("Enter name of runner 2")
    var runner2 = readLine()!!
    println("Enter name of runner 3")
    var runner3 = readLine()!!
    println("Enter time of runner1")
    var time1 = readLine()!!
    println("Enter time of runner2")
    var time2 = readLine()!!
    println("Enter time of runner3")
    var time3 = readLine()!!

    if (time1 > time2) {
        var temporaryTime = time1
        var tempRunner = runner1
        time1 = time2
        time2 = temporaryTime
        runner1 = runner2
        runner2 = tempRunner
    }
    if (time2 > time3) {
        var temporaryTime = time2
        var tempRunner = runner2
        time2 = time3
        time3 = temporaryTime
        runner2 = runner3
        runner3 = tempRunner
    }
    if (time1 > time2) {
        var temporaryTime = time1
        var tempRunner = runner1
        time1 = time2
        time2 = temporaryTime
        runner1 = runner2
        runner2 = tempRunner
    }
    println(runner1)
    println(runner2)
    println(runner3)
}