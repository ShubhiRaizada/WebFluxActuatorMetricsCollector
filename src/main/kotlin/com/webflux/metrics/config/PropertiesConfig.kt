package com.webflux.metrics.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding

@ConstructorBinding
@ConfigurationProperties(prefix = "properties")
data class PropertiesConfig(
        val urlPrefix: String
)