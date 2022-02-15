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

fun main() {
    val user = setUser("Alfian", 19)
    println(user)

    printUser("Alfian")
}

fun setUser(name: String, age: Int) = "Your name is $name, and you $age years old"

fun printUser(name: String) {
    println("Your name is $name")
}
