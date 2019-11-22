import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import page1.Phone;

public class Test1 {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
//        Hello hello = (Hello)context.getBean("hello");
//        Hello hello1 = context.getBean("hello",Hello.class);
//        hello.hello();
//        Hi hi=(Hi)context.getBean("hi");
//        hi.hi();
//        System.out.println(hello);
//        System.out.println(hi);
//        System.out.println(hello.toString());
//        System.out.println(hello1.toString());
//        System.out.println(hello==hello1);
//        ClientService clientService = context.getBean("clientService", ClientService.class);
//        clientService.say();
//        System.out.println(clientService);
//        World world = context.getBean("world", World.class);
//        World world1 = context.getBean("world", World.class);
//        world.say();
//        System.out.println(world);
//        System.out.println(world==world1);

        Phone phone = context.getBean("phone", Phone.class);
        phone.show();
        phone.getHello();
    }
}
