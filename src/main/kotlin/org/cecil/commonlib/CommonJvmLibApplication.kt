package org.cecil.commonawsjvm

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CommonJvmLibApplication

fun main(args: Array<String>) {
	runApplication<CommonJvmLibApplication>(*args)
}
