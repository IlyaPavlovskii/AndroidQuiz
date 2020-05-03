package by.bulba.android.quiz_05_05_2020

val obj: MyClass = MyClass.C

fun main() {
    when(obj) {
        MyClass.A -> println("A")
        is MyClass.B -> println("B")
    }
}

sealed class MyClass {
    object A : MyClass()
    class B(val value: Int) : MyClass()
    object C : MyClass()
}