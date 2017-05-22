import autowiring.other.CompanyBean;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainRunner {
    public static void main(String[] args) {

        /**
         * Here example how to work next annotation
         * @Autowired,
         * @Requared,
         * @Qualifier,
         * @PostConstruct,
         * @PreDestroy
         */
        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext("spring-config.xml");
        CompanyBean companyBean = (CompanyBean) context.getBean("company");
        System.out.println("Company name: "+ companyBean.getCompanyName());
        System.out.println("Numbers of customers: "+ companyBean.getCustomersBean().getNumberOfCustomers());
        System.out.println("Numbers of workers: "+ companyBean.getWorkersBean().getNumberOfWorkers());
        context.registerShutdownHook();

        /**
         * Here example how you can use context events.
         * - ContextStartEvent       * When context started by start()
         * - ContextStopEvent        * When context stopped by stop()
         * - ContextRefreshEvent     * When context refresh() or init
         * - ContextCloseEvent       * When context closed by close()
         */
//        context.start();
//        Message message = (Message) context.getBean("message");
//        context.refresh();
//        System.out.println("Message: " + message.getMessage());
//        context.stop();
//        context.start();
//        System.out.println("Message: " + message.getMessage());
//        context.close();

        /**
         * Here example how you can use customers events.
         */

//        EventPublisher eventPublisher = (EventPublisher) context.getBean("customerPublisher");
//        eventPublisher.publishEvent();
//        context.close();
    }
}
