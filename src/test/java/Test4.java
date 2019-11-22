import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import page1.Service;

public class Test4 {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");

        Service service= context.getBean("service", Service.class);

        System.out.println(service.person1);
        service.person1.say();
        System.out.println(service.person2);
        service.person2.say();
        System.out.println(service.person3);
        service.person3.say();

    }
}
