package britishgas.service;
import britishgas.SpringBootRabbitMQApplication;
import britishgas.model.Employee;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQConsumer {

    @RabbitListener(queues = SpringBootRabbitMQApplication.EXCHANGE_NAME)
    public void receiveMessage(final Employee message) {
        System.out.println("Received message: "+ message.toString());
    }
}