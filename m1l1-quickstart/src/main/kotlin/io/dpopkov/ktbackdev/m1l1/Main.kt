package io.dpopkov.ktbackdev.m1l1

fun main() {
    println(Greeting().message)
}

class Greeting(val message: String = "Hello World!")
