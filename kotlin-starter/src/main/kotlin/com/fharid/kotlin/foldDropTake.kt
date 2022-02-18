package com.fharid.kotlin

//fold
/*
fun main(){
    val numbers = listOf(1, 2, 3)
    val fold = numbers.foldRight(10) { item, current ->
        println("current $current")
        println("item $item")
        println()
        item + current
    }

    println("Fold result: $fold")

}
 */

//Drop (memangkas beberapa item)
/*
fun main(){
    val num = listOf(1,2,3,4,5,6)
    val drop = num.drop(2)

    println(drop)
    // output : 3,4,5,6

 */

//dropLast (memangkas beberapa item dari terakhir)
/*
fun main (){
    val num = listOf(1,2,3,4,5,6,7)
    val drop = num.dropLast(4)

    println(drop)
}
*/

//take (menyaring beberapa item)
/*
fun main(){
    val num = listOf(1,2,3,4,5,6,7)
    val take = num.take(4)

    println(take)
}
 */

//takeLast (menyaring item dari belakang)
/*
fun main (){
    val num = listOf(1,2,3,4,5,6)
    val take = num.takeLast(4)

    println(take)
}
 */





