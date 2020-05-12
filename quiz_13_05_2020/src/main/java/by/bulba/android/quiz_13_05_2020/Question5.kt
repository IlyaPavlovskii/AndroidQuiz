package by.bulba.android.quiz_13_05_2020

class Question5 {
    val a: Int by lazy { b() }
    val b: (() -> Int) = { 1 }
}

fun main() {
    with(Question5()) {
        println("$a$b")
    }
}