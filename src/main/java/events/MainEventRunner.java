package events;

import events.contextEvent.Message;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEventRunner {
    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext("spring-config.xml");
        context.start();
        Message message = (Message) context.getBean("message");
        context.refresh();
        System.out.println("Message: " + message.getMessage());
        context.stop();
        context.start();
        System.out.println("Message: " + message.getMessage());
        context.close();

    }
}
