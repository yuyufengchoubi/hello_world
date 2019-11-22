import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import page2.BeanInitDestory;

public class Test6 {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");

//        TestConfig config = context.getBean(TestConfig.class);
//
//
//        System.out.println(config.toString());
//
//        System.out.println(config.value1);
//        System.out.println(config.value2);
//        System.out.println(config.name);
//        System.out.println(config.age);
//        System.out.println(config.sex);

        BeanInitDestory beanInitDestroy = context.getBean("beanInitDestroy", BeanInitDestory.class);

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ((ClassPathXmlApplicationContext) context).close();

    }
}

