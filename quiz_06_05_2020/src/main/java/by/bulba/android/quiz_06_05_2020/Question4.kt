package by.bulba.android.quiz_06_05_2020

class Person(name: String) {
    var name = name
        get() = if (name == "John") "Jaan" else name
}

fun main() {
    println(Person("John").name)
}