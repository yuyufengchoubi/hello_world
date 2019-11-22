package page3;

import org.springframework.context.ApplicationEvent;

//@Component
//@Scope("prototype")
public class DemoEvent extends ApplicationEvent {

    private String msg;

    public DemoEvent(Object source,String msg){
        super(source);
        this.msg=msg;
    }


    public void say(){
        System.out.println("我这个事件发生了，消息是："+this.msg);
    }

    public String getMsg(){
        return this.msg;
    }
}
