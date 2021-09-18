package com.webflux.metrics.config


import com.webflux.metrics.RequestHandler
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType
import org.springframework.web.reactive.function.server.RouterFunction
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.router


@Configuration
class RouterConfig(
        private val propertiesConfig: PropertiesConfig
) {
    @Bean
    fun getStudentsRoute(
            requestHandler: RequestHandler
    ): RouterFunction<ServerResponse> = router {
        (accept(MediaType.APPLICATION_JSON)).nest {
            GET("matching-pattern-1", requestHandler::handler)
            POST("matching-pattern-2", requestHandler::handler)
            PUT("matching-pattern-3", requestHandler::handler)
            DELETE("matching-pattern-4", requestHandler::handler)
        }
    }
}