package week04
//Andrew Ruano, barChart.kt, 9-25-2022
fun main(){
    println("Enter today's sales for store 1: ")
    var store1 = Integer.valueOf(readLine())
    println("Enter today's sales for store 2: ")
    var store2 = Integer.valueOf(readLine())
    println("Enter today's sales for store 3: ")
    var store3 = Integer.valueOf(readLine())
    println("Enter today's sales for store 4: ")
    var store4 = Integer.valueOf(readLine())
    println("Enter today's sales for store 5: ")
    var store5 = Integer.valueOf(readLine())
    var i =0
    var stores = intArrayOf(store1,store2,store3,store4,store5)
    while(i < 1){
        var total = 0;var total1 = 0; var total2 = 0;var total3 = 0;var total4 = 0;
        total = stores[0] / 100
        total1 = stores[1] / 100
        total2 = stores[2] / 100
        total3 = stores[3] / 100
        total4 = stores[4] / 100
        var character = "*".repeat(total)
        var character1 = "*".repeat(total1)
        var character2 = "*".repeat(total2)
        var character3 = "*".repeat(total3)
        var character4 = "*".repeat(total4)
        println("Sales Bar Chart")
        println("Store 1:$character")
        println("Store 2:$character1")
        println("Store 3:$character2")
        println("Store 4:$character3")
        println("Store 5:$character4")
        i++
    }
}
