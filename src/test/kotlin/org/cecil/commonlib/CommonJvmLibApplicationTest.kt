package org.cecil.commonlib

import org.springframework.boot.fromApplication
import org.springframework.boot.test.context.TestConfiguration
import org.springframework.boot.with

@TestConfiguration(proxyBeanMethods = false)
class CommonLibApplicationTest

fun main(args: Array<String>) {
	fromApplication<CommonJvmLibApplication>().with(CommonLibApplicationTest::class).run(*args)
}
