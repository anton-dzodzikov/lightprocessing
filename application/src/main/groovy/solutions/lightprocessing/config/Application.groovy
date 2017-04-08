package solutions.lightprocessing.config

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.web.support.SpringBootServletInitializer
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication(scanBasePackages = "solutions.lightprocessing.config")
class Application {
    static void main(String... args) {
        SpringApplication.run(Application.class, args)
    }
}