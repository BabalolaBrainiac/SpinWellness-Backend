package com.spinwellness

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpinWellnessApplication

fun main(args: Array<String>) {
	runApplication<SpinWellnessApplication>(*args)
}
