package events.contextEvent;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;

public class CloseEventHandler implements ApplicationListener<ContextClosedEvent> {

    public void onApplicationEvent(ContextClosedEvent contextClosedEvent) {
        System.out.println(" - Closed context event");
    }
}
