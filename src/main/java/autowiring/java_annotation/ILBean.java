package autowiring.java_annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ILBean {
    private String model;
    private Integer numberOfpassangers;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getNumberOfpassangers() {
        return numberOfpassangers;
    }

    public void setNumberOfpassangers(Integer numberOfpassangers) {
        this.numberOfpassangers = numberOfpassangers;
    }
    @PostConstruct
    public void postConstruct(){
        System.out.println("init ilBean");
    }
    @PreDestroy
    public void preDestroy(){
        System.out.println("destroy ilBean");
    }
}
