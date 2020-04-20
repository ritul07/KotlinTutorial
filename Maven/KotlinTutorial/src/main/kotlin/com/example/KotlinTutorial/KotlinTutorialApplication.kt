package com.example.KotlinTutorial

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinTutorialApplication

fun main(args: Array<String>) {
	runApplication<KotlinTutorialApplication>(*args)
}
