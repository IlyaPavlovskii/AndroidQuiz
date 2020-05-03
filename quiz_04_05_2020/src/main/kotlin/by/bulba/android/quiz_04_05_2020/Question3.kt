package by.bulba.android.quiz_04_05_2020

fun main() {
    printInline {
        print("2")
        // https://kotlinlang.org/docs/reference/inline-functions.html#non-local-returns
        //return
    }
}

inline fun printInline(
    crossinline block: ()->Unit
) {
    print("1")
    block()
    print("3")
}