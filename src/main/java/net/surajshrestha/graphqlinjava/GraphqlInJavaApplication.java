package net.surajshrestha.graphqlinjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "net.surajshrestha")
public class GraphqlInJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(GraphqlInJavaApplication.class, args);
    }
}
