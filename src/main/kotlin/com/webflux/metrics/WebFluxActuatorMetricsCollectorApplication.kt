package com.webflux.metrics

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

@SpringBootApplication
@ConfigurationPropertiesScan
class WebFluxActuatorMetricsCollectorApplication

fun main(args: Array<String>) {
	runApplication<WebFluxActuatorMetricsCollectorApplication>(*args)
}
