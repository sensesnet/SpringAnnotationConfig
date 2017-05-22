package events.customerEvent;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class EventPublisher implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher publisher;

    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {

        this.publisher = applicationEventPublisher;
    }

     public void publishEvent(){
         Event event = new Event(this);
         publisher.publishEvent(event);
     }
}
