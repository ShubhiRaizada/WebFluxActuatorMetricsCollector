package com.webflux.metrics.config

import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.client.WebClient

@Configuration
class WebClientConfig(
        val propertiesConfig: PropertiesConfig
) {
    @Bean
    @Qualifier("webClient")
    fun webClient(webClientBuilder: WebClient.Builder): WebClient =
            webClientBuilder.baseUrl(propertiesConfig.urlPrefix)
                    .build()
}