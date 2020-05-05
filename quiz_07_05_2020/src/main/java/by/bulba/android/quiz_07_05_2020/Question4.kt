package by.bulba.android.quiz_07_05_2020

fun main() {
    val list = listOf<Int>()
    (list as MutableList<Int>).add(1)
    list.forEach { println(it) }
}