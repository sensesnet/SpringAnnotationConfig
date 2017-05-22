package events.customerEvent;

import org.springframework.context.ApplicationListener;

/**
 * Class implement ApplicationListener
 * and override "onApplicationEvent"
 */
public class CustomerEventHandler implements ApplicationListener<Event> {

    @Override
    public void onApplicationEvent(Event event) {
        System.out.print("Customer Handler: ");
        System.out.println(event.toString());
    }

}
