package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan{basePackages = "config"}
public class App {
    public static void main(String[] args) throws Throwable {
        SpringApplication.run(App.class, args);
    }
}
