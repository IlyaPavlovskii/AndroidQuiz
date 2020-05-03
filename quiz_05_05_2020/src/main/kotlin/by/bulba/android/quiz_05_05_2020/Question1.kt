package by.bulba.android.quiz_05_05_2020

fun main() {
    listOf(1, 2, 3).forEach {
        if (it > 2) return
        print(it)
    }
    print("ok")
}