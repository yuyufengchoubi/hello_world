package page2;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component(value = "beanInitDestroy")
@Scope("singleton")
public class BeanInitDestory {

    @PostConstruct
    public void init(){
        System.out.println("我被初始化了");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("我即将被销毁");
    }


}
