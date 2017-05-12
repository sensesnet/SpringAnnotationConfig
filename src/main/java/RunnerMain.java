import autowiring.CompanyBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunnerMain {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
        CompanyBean companyBean = (CompanyBean) ac.getBean("company");
        System.out.println("Company name: "+ companyBean.getCompanyName());
        System.out.println("Numbers of customers: "+ companyBean.getCustomersBean().getNumberOfCustomers());
        System.out.println("Numbers of workers: "+ companyBean.getWorkersBean().getNumberOfWorkers());

        ac.registerShutdownHook();
    }
}
