package com.webflux.metrics

import com.webflux.metrics.config.PropertiesConfig
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.client.WebClient
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import reactor.core.publisher.Mono

@Component("requestHandler")
class RequestHandler(
        @Qualifier("webClient")
        private val webClient: WebClient,
        private val propertiesConfig: PropertiesConfig
) {
        fun handler(request: ServerRequest): Mono<ServerResponse> {
                return webClient.method(request.method())
                        .uri(request.path())
                        .exchangeToMono {
                                it.bodyToMono()
                        }
        }

}