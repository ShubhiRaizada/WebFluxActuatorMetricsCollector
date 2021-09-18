package com.webflux.WebFluxActuatorMetricsCollector

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WebFluxActuatorMetricsCollectorApplication

fun main(args: Array<String>) {
	runApplication<WebFluxActuatorMetricsCollectorApplication>(*args)
}
