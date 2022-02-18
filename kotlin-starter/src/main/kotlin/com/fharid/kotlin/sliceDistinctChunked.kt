package com.fharid.kotlin

//Slice (menyaring nilai dari posisi tertentu berdasarkan index)
/*
fun main (){
    val num = listOf(1,2,3,4,5,6,7,8,9,10,11)
    val slice = num.slice(3..7)

    println(slice)
    //output : [4, 5, 6, 7, 8]
}
 */

//slice with index
/*
fun main(){
    val index = listOf(0,6,9) //bisa disebutkan dulu mau slice index ke berapa
    val num = listOf(1,2,3,4,5,6,7,8,9,10,11,12)
    val slice = num.slice(index)

    println(slice)
}
 */

//distinct (menyaring objek yang sama)
/*
fun main(){
    val total = listOf(1, 2, 1, 3, 4, 5, 2, 3, 4, 5)
    val distinct = total.distinct()

    println(distinct)
}
*/

/*
fun main() {
    data class Item(val key: String, val value: Any)

    val items = listOf(
        Item("1", "Kotlin"),
        Item("2", "is"),
        Item("3", "Awesome"),
        Item("3", "as"),
        Item("3", "Programming"),
        Item("3", "Language")
    )

    val distinctItems = items.distinctBy { it.key }
    distinctItems.forEach {
        println("${it.key} with value ${it.value}")

    }
}
 */

//chunked (memisahkan nilai)
/*
fun main (){
    val word = "Internet"
    val chunked = word.chunked(4){
        it.toString().toUpperCase()//mengubah size huruf
    }
    println(chunked)
    //output [INTE, RNET]
}
 */