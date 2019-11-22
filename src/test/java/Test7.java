import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import page3.DemoPublisher;

public class Test7 {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
//        DemoEvent demoEvent = context.getBean(DemoEvent.class);
//        context.publishEvent(demoEvent);

        DemoPublisher bean = context.getBean(DemoPublisher.class);
        bean.publish("我是玉玉风");
    }
}
