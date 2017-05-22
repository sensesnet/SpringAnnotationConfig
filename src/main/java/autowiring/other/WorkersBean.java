package autowiring.other;

import org.springframework.beans.factory.annotation.Required;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class WorkersBean {
    private int numberOfWorkers;

    public int getNumberOfWorkers() {
        return numberOfWorkers;
    }

    @Required
    public void setNumberOfWorkers(int numberOfWorkers) {
        this.numberOfWorkers = numberOfWorkers;
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("init workersBean");
    }
    @PreDestroy
    public void preDestroy(){
        System.out.println("destroy workersBean");
    }
}
