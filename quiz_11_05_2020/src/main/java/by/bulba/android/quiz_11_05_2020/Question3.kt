package by.bulba.android.quiz_11_05_2020

fun printNumberSign(num: Int) {
    if (num < 0) {
        "negative"
    }  else if (num > 0) {
        "positive"
    } else {
        "zero"
    }.let { println(it) }
}

fun main() {
    printNumberSign(2)
    printNumberSign(0)
    printNumberSign(-2)
}