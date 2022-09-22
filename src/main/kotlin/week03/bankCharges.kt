package week03
fun main(){
    println("How many checks were written this month?")
    var checks = Integer.valueOf(readLine())!!
    var fee: Double = 10.0
    var total: Double = 0.0
    var temp: Double = 0.0
    if(checks < 20){
        var serviceFee = 0.10
        temp = checks * serviceFee
        total = temp + fee
    }
    if(checks in 21..39){
        var serviceFee = 0.08
        temp = checks * serviceFee
        total = temp + fee
    }
    if(checks in 40..59){
        var serviceFee = 0.06
        temp = checks * serviceFee
        total = temp + fee
    }
    if(checks >= 60){
        var serviceFee = 0.08
        temp = checks * serviceFee
        total = temp + fee
    }
    println(total)
}
