package com.eprofessor.eprofessor

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EprofessorApplication

fun main(args: Array<String>) {
	runApplication<EprofessorApplication>(*args)
}
