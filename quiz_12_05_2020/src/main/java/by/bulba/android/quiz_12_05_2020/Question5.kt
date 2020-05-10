package by.bulba.android.quiz_12_05_2020

fun function(
    block1: (() -> String)? = null,
    block2: (() -> String)? = null
) {
    block1?.let { println("Block1: ${it()}") }
    block2?.let { println("Block2: ${it()}") }
}

fun main() {
    function { "block" }
}