package autowiring.java_annotation;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Configuration
@Scope("singleton")

public class AirplaneBean {


    private AirplaneBean airplaneBean = null;
    private BoeingBean boingBean;
    private ILBean ilBean;
    private String flight;

    public AirplaneBean(BoeingBean boingBean, ILBean ilBean, String flight) {
        this.boingBean = boingBean;
        this.ilBean = ilBean;
        this.flight = flight;
    }

    public BoeingBean getBoingBean() {
        return boingBean;
    }

    public void setBoingBean(BoeingBean boingBean) {
        this.boingBean = boingBean;
    }

    public ILBean getIlBean() {
        return ilBean;
    }

    public void setIlBean(ILBean ilBean) {
        this.ilBean = ilBean;
    }

    public String getFlight() {
        return flight;
    }

    public void setFlight(String flight) {
        this.flight = flight;
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("init airplaneBean");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("destroy airplaneBean");
    }
}
