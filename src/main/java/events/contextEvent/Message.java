package events.contextEvent;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Message {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    @PostConstruct
    public void postConstruct(){
        System.out.println("init messageBean");
    }
    @PreDestroy
    public void preDestroy(){
        System.out.println("destroy messageBean");
    }
}
