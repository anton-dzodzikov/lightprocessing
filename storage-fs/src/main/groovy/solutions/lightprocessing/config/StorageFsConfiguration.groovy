package solutions.lightprocessing.config

import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@Configuration
@ComponentScan("solutions.lightprocessing.storage.fs")
class StorageFsConfiguration {
}
