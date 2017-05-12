package autowiring.java_annotation;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@Scope("singleton")

public class AirplaneBean {


    private AirplaneBean airplaneBean = null;
    private BoingBean boingBean;
    private ILBean ilBean;
    private String flight;

    public AirplaneBean(BoingBean boingBean, ILBean ilBean, String flight) {
        this.boingBean = boingBean;
        this.ilBean = ilBean;
        this.flight = flight;
    }

    public BoingBean getBoingBean() {
        return boingBean;
    }

    public void setBoingBean(BoingBean boingBean) {
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
}
