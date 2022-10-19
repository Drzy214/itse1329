package week5
fun main(){
    println("Enter NS: ")
    var NS: Int = Integer.valueOf(readLine())
    println("Enter SP: ")
    var SP: Int = Integer.valueOf(readLine())
    println("Enter SC: ")
    var SC: Int = Integer.valueOf(readLine())
    println("Enter PP: ")
    var PP: Int = Integer.valueOf(readLine())
    println("Enter PC: ")
    var PC: Int = Integer.valueOf(readLine())
    if(profit(NS,SP,SC,PP,PC) < 0) {
        println(profit(NS, SP, SC, PP, PC))
        print("Loss Profit")
    }
    if(profit(NS,SP,SC,PP,PC) > 0)
        println(profit(NS, SP, SC, PP, PC))
        print("Profit!")

}
fun profit(NS: Int, SP: Int, SC: Int, PP: Int, PC: Int): Int{
    return ((NS*SP) - SC) - ((NS*PP) + PC)
}
