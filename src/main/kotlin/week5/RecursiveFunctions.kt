//Andrew Ruano, 10/18/2022, 5.2 Recursive Functions
package week5
fun main(){
    println(fibonacci(4))
}
fun fibonacci(number: Int): Int{
    if(number < 0) {
        return 0
    }
    if(number == 1 || number == 2){
        return 1
    }
    return fibonacci(number-1) + fibonacci(number-2)

}
