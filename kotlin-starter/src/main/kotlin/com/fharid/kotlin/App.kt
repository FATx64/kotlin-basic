package com.fharid.kotlin

//basic code
/*
fun main() {
    /*val firstWord = "Dicoding "
    val lastWord = "Academy"
    print(firstWord + lastWord)
    */

    /*string character
    val valueA = 10
    val valueB = 20
    println(valueA + valueB)

    */

    //increment character
    /*var vocal = 'A'
        println("Vocal " + vocal++)
        println("Vocal " + vocal++)
        println("Vocal " + vocal++)
        println("Vocal " + vocal--)
        println("Vocal " + vocal--)
        println("Vocal " + vocal--)
        println("Vocal " + vocal--)
    */

    //ngetes variabel
    /* var vocal = 'B'
        println(vocal)

     */

    //string dengan indexing
    /*
    val text  = "Kotlin"
    val firstChar = text[0]

    print("First character of $text is $firstChar")
    //output be like : First character is Kotlin is K
     */

    //iterasi string menggunakan for-loop
    /*val text = "Kotlin"
    for(char in text){
        print("$char ") //output be like : K o t l i n
    }
     */

    //Escape string
    /*val statement = "Kotlin is \"Awesome!\""
    print(statement)
     */
    //output be like : kotlin is "Awasome!

    //unicode
    /*
    val name = "Unicode test: \u00A9"
    print(name)
     */

    //Raw Strings
    /*
    val line = """
        Line 1
        Line 2
        Line 3
        Line 4
    """.trimIndent()

    print(line)
     */

}
 */


//Function
/*
fun main() {
    val user = setUser("Alfian", 19)
    println(user)

    printUser("Alfian")
}

fun setUser(name: String, age: Int) = "Your name is $name, and you $age years old"

fun printUser(name: String) {
    println("Your name is $name")
}
 */

//if else kotlin
/*
fun main(){
    val openHours = 7
    val now = 10
    val office: String
    office = if (now > 7) {
        "Office already open"
    } else if (now == openHours){
        "Wait a minute, office will be open"
    } else {
        "Office is closed"
    }

    print(office)
}
 */

//Conjunction atau AND pada kotlin
/*
fun main(){

        val officeOpen = 7
        val officeClosed = 16
        val now = 20

        val isOpen = now >= officeOpen && now <= officeClosed

        print("Office is open : $isOpen")

        //Output be like : Office is open : false
}
 */

//boolean disjunction atau OR pada kotlin
/*
fun main() {
    val officeOpen = 4
    val officeClosed = 12
    val now = 2

    val isClose = now < officeOpen || now > officeClosed

    print("Office is closed : $isClose")

    //Output : Office is closed : true
}
 */

//negation atau NOT pada kotlin
/*
fun main() {
    val officeOpen = 7
    val now = 6
    val isOpen = now > officeOpen

    if (!isOpen) {
        print("Office is closed")
    } else {
        print("Office is open")
    }

}
*/

//Mencari nilai Min & Max number pada Kotlin
/*
fun main() {
    val maxInt = Int.MAX_VALUE
    val minInt = Int.MIN_VALUE

    println(maxInt)
    println(minInt)

    /*
     output :
            2147483647
            -2147483648
     */
}
 */

//contoh jika terjadi overflow (kelebihan kapasitas
/*
fun main() {
    val maxInt = Int.MAX_VALUE
    val overRangeInt = Int.MAX_VALUE + 1 // This operation has led to an overflow

    println("Max Int: $maxInt")
    println("Over range Int: $overRangeInt")
}

Output :

Max Int: 2147483647
Over range Int: -2147483648
*/

//konversi tipe data (byte ke int)
/*
fun main() {
    val byteNumber: Byte = 10
    val intNumber: Int = byteNumber.toInt() // ready to go
}
*/
/* fungsi konversi

    toByte(): Byte

    toShort(): Short

    toInt(): Int

    toLong(): Long

    toFloat(): Float

    toDouble(): Double

    toChar(): Char
 */
/*
fun main() {
    val stringNumber = "23"
    val intNumber = 3

    print(intNumber + stringNumber.toInt())
    /*
     output: 26
     */
}
 */

//array
/*
fun main() {
    val intArray = intArrayOf(1, 3, 5, 7)  // [1, 3, 5, 7]
    intArray[2] = 11                       // [1, 3, 11, 7]

    print(intArray[2])
    //output = 11
}
*/
/*
Kotlin juga memungkinkan kita untuk membuat Array dengan tipe data primitif dengan
memanfaatkan beberapa fungsi spesifik berikut:
    intArrayOf() : IntArray

    booleanArrayOf() : BooleanArray

    charArrayOf() : CharArray

    longArrayOf() : LongArray

    shortArrayOf() : ShortArray

    byteArrayOf() : ByteArray
 */

//string template
/*
fun main() {
    val name = "Kotlin"
    print("My name is $name")
}
*/
//string template pada if conditions
/*
fun main() {
    val hour = 7
    print("Office ${if (hour > 7) "already close" else "is open"}")
}
*/
/*
fun main() {
    val color : Color = Color.RED
    print(color)
}

enum class Color{
    RED, GREEN, BLUE, Yellow
}
 */

//mengecek instancce dari enum
/*
fun main() {
    val color: Color = Color.GREEN

    when(color){
        Color.RED -> print("Color is Red")
        Color.BLUE -> print("Color is Blue")
        Color.GREEN -> print("Color is Green")
    }
}

enum class Color(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}
*/

//when expression
/*
fun main() {
    val value = 7

    when(value){
        6 -> println("value is 6")
        7 -> println("value is 7")
        8 -> println("value is 8")
    }
}
*/
//when ketika ada 2 baris kode pada setiap argument
/*
fun main(){
    val num = 7
    val stringofnum = when (num) {
        6 ->{
            println("six")
            "num is six"
        }
        7 ->{
            println("seven")
            "num is seven"
        }
        8 ->{
            println("Eight")
            "num is eight"
        }
        else ->{
            println("value not found")
            "num is not fount"
        }

    }
    print (stringofnum)
}
*/

//when dalam pengecekan tipe data
/*
fun main(){
    val anyType : Any = 100L
    when (anyType) {
    is Long -> println ("Type data is long")
    is String -> println ("Type data is string")
    else -> println ("type data is undefined")
    }
}
 */

//mengecek value dalam range atau tidak
/*
fun main(){
    val numRange = 155
    val ranges = 10..15
    when (numRange){
        in ranges -> println ("Num is in range")
        !in ranges -> println ("Num is not in range")
        else -> println ("Num is undefined")
    }

}
*/

//while function
/*
fun main (){
    var counter = 1
    while (counter <= 7){
        println ("hello sekai")
        counter++
    }
}
*/

//do while function
/*
fun main(){
    var counter = 1
    do{
        println("hello isekai")
        counter++
    }
    while (counter <=7)
}
 */

//infinite loop
/*
fun main(){
    var value = 9
    do {
        println("Test")
        value --
    }
    while (value <= 10)
}
*/

//step
/*
fun main(){
    val rangeInt = 1..10
    print (rangeInt.step)
}
 */

//mengambil step 2 dari range
/*
fun main(){
    val rangeInt = 1..10 step 2
    rangeInt.forEach{
        println("$it ")
    }

    print(rangeInt.step)
}
 */

//mengecek nilai pada Down to / rangeto
/*
fun main(){
    val downInt = 10.downTo(1)
    if(11 in downInt){
        print("num is available")
    }
    else{
        print("num is undefined")
    }
}
 */

//memeriksa apakah nilai tidak ada
/*
fun main(){
    val downInt = 10.downTo(1)
    if (11 !in downInt){
        print("num is no range")
    }
}
 */

//for loop
/*
fun main(){
    val ranges = 1..10
    for (i in ranges){
        println("value is $i!")
    }
}
 */
//for loop
/*
fun main(){
    val ranges = 1.rangeTo(10) step 3
    for (i in ranges){
        println("value is $i!")
    }
}
 */
//for loop with index
/*
fun main() {
    val ranges = 1.rangeTo(10) step 3
    for ((index, value) in ranges.withIndex()) {
        println("value $value with index $index")
    }
}
 */