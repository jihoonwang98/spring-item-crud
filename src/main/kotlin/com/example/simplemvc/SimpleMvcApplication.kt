package com.example.simplemvc

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SimpleMvcApplication

fun main(args: Array<String>) {
    runApplication<SimpleMvcApplication>(*args)
}
