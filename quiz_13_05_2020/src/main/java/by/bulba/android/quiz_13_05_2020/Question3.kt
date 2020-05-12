package by.bulba.android.quiz_13_05_2020

class MyClass3 {
    init {
        print("b")
    }
    companion object {
        operator fun invoke(): MyClass3 {
            print("a")
            return MyClass3()
        }
    }
}

fun main() {
    MyClass3()
}