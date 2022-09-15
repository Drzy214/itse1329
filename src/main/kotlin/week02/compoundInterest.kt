import kotlin.math.pow

fun main(args: Array<String>){
    println("Enter amount of principle originally deposited into the bank account: ")
    var deposit = readLine()!!.toDouble()
    println("Enter the annual interest rate paid by the the accountant: ")
    var interestRate = readLine()!!.toDouble()
    println("Enter the number of times the interest rate is compounded per year:  ")
    var compound = readLine()!!.toDouble()
    println("Enter the number of years the account will be left to earn interest: ")
    var accountInterest = readLine()!!.toDouble()

    var conversion: Double = (1 + (interestRate/compound))
    var amount: Double = (deposit * conversion)
    var totalAmount: Double = amount * (compound * accountInterest)
    println(totalAmount)
}

