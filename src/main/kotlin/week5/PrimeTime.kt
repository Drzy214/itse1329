//Andrew Ruano, 10-18-2022, 5.1
package week5
fun main(){
    println(isPrime(13))
    println(isPrime(6))
    println(isPrime(8893))
}
fun isNumberDivisible(number: Int, divisor: Int): Boolean {
    var results: Boolean = false
    if (number % 2 == 0) {
        results = true
    }
    return results
}

    fun isPrime(number: Int): Boolean {
        var results: Boolean = false
        if(number <= 0)
            return false
        for(i in 2 until number)
        if(isNumberDivisible(number,i)){
            return false
        }
        return true
    }