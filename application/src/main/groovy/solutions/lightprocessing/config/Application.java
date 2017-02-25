package solutions.lightprocessing.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"solutions.lightprocessing.conf", "solutions.lightprocessing.controller", "solutions.lightprocessing.component"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}