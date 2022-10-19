package week5
fun main(){
    println("Enter Items Wholesale cost >> ")
    var wCost = readLine()?.toDouble()!!
    println("Enter Items markup percentage >> ")
    var mCharge = readLine()?.toDouble()!!
    calculateRetail(wCost,mCharge)
}
fun calculateRetail(wholesaleCost: Double, markupCharge: Double){
    var conversion = (markupCharge * 0.01) * wholesaleCost
    var fConversion = conversion + wholesaleCost
    println(fConversion)


}
