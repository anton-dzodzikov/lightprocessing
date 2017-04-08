package solutions.lightprocessing.config

import org.glassfish.jersey.server.ResourceConfig
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class WebConfiguration {
    @Bean
    ResourceConfig jerseyConfig() {
        new ResourceConfig().packages("solutions.lightprocessing.controller")
    }
}
