package co.uk.britishgas;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootRabbitMQApplication {

    public static void main(String[] args) {

        SpringApplication.run(
                new Object[] { SpringBootRabbitMQApplication.class }, args);
    }
}
