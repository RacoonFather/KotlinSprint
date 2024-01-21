package org.example.lesson_1

fun main() {

    val seconds = 6480
    val minutes = seconds /  60 % 60
    val hours = seconds / 60 / 60
    println("$hours:$minutes:00")

}