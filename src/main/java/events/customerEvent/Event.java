package events.customerEvent;

import org.springframework.context.ApplicationEvent;

public class Event extends ApplicationEvent{

    public Event(Object source) {
        super(source);
    }

    @Override
    public String toString() {
        return " - Event: Customers event!";
    }
}
