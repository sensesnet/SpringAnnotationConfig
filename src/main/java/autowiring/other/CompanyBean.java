package autowiring.other;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class CompanyBean {

    private String companyName;
    @Qualifier("customers")
    private CustomersBean customersBean;
    @Qualifier("workers")
    private WorkersBean workersBean;

    @Autowired
    public CompanyBean(String companyName, CustomersBean customersBean, WorkersBean workersBean) {
        this.companyName = companyName;
        this.customersBean = customersBean;
        this.workersBean = workersBean;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public CustomersBean getCustomersBean() {
        return customersBean;
    }

    public void setCustomersBean(CustomersBean customersBean) {
        this.customersBean = customersBean;
    }

    public WorkersBean getWorkersBean() {
        return workersBean;
    }

    public void setWorkersBean(WorkersBean workersBean) {
        this.workersBean = workersBean;
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("init companyBean");
    }
    @PreDestroy
    public void preDestroy(){
        System.out.println("destroy companyBean");
    }
}
