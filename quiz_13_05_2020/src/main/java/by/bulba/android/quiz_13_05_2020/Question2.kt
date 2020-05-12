package by.bulba.android.quiz_13_05_2020

class MyClass {
    val a: Int get() = CONST++
    val b: Int = a
    private companion object {
        private var CONST = 0
    }
}

fun main() {
    val obj = MyClass()
    println("${obj.a}${obj.b}")
}