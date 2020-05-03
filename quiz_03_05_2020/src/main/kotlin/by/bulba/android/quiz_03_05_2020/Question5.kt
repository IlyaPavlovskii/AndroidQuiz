package by.bulba.android.quiz_03_05_2020

fun main() {
    printInline {
        print("2")
        return
    }
}

inline fun printInline(block: () -> Unit) {
    print("1")
    block()
    println("3")
}