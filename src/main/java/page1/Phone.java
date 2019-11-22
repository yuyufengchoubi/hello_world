package page1;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.lang.NonNull;

public class Phone {

    @NonNull
    private Hello hello;

    private String Name;
    private Integer Time;
    private String Power;

    public Phone(String name, int time){
        this.Name=name;
        this.Time=time;
    }

    @Required
    public void setPower(String power){
        this.Power=power;
    }

//    @Autowired
//    @Qualifier
//    public void setHello(Hello hello) {
//        this.hello = hello;
//    }

    public void show(){
        System.out.println("电话的名称："+this.Name+"; 使用时间为："+this.Time+"; 电量为："+this.Power);
    }

    public void getHello(){
        hello.hello();
    }
}
