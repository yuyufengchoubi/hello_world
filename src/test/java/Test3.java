import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import page1.Body;

public class Test3 {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        Body body1 = (Body)context.getBean("body");
        Body body2 = (Body)context.getBean("body");

        System.out.println(body1==body2);
    }
}
