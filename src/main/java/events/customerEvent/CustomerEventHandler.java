package events.customerEvent;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * Class implement ApplicationListener
 * and override "onApplicationEvent"
 */
public class CustomerEventHandler implements ApplicationListener {

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println(event.toString());
    }

}
