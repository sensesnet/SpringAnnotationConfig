package autowiring;

import org.springframework.beans.factory.annotation.Required;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class CustomersBean {

    private int numberOfCustomers;

    public int getNumberOfCustomers() {
        return numberOfCustomers;
    }
    @Required
    public void setNumberOfCustomers(int numberOfCustomers) {
        this.numberOfCustomers = numberOfCustomers;
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("init customersBean");
    }
    @PreDestroy
    public void preDestroy(){
        System.out.println("destroy customersBean");
    }

}
