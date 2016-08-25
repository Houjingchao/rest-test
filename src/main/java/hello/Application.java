package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by jaf on 16/8/25.
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Application{
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

