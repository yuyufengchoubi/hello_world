import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import page1.Factory;
import page1.Hello;

public class Test2 {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");

        Factory factory = context.getBean("factory", Factory.class);

        Hello hello = factory.getHello();

        hello.hello();

        Hello hello1=context.getBean("hello",Hello.class);

        System.out.println(hello==hello1);
    }
}
