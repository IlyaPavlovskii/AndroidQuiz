package by.bulba.android.quiz_06_05_2020

fun main() {
    val a: String? = null
    val b = a?.let {
        "1"
        null
    } ?: "2"
    println(b)
}