package nest.hana.EagerDeveloper.rabbitMQ;


import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.MessageProperties;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQProducer {

    final static String QUEUE_NAME = "rabbitMQ";

//    @PostConstruct
    private void init() {

        int TEST_MESSAGES = 4;

        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        factory.setPort(5672);
        factory.setUsername("guest");
        factory.setPassword("guest");

        try (Connection connection = factory.newConnection();
             Channel channel = connection.createChannel()) {
            for (int i = 1; i <= TEST_MESSAGES; i++) {
                channel.queueDeclare(QUEUE_NAME, true, false, false, null);
                String message = "Hello World!" + i;
                channel.basicPublish("", QUEUE_NAME,
                        MessageProperties.PERSISTENT_TEXT_PLAIN,
                        message.getBytes("UTF-8"));
                System.out.println(" [x] Sent '" + message + "'");
            }
        }catch (Exception e){

        }

    }



}
