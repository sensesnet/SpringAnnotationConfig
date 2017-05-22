package events.customerEvent;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class CustomerEventHandler implements ApplicationListener {

    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        System.out.println(" - Here is customer events!");

    }
}
