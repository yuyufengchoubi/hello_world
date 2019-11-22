package page2;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Enhancer {

    @Pointcut("execution(* page2.Player.play())")
    public void enhancer(){

    }

    @Before(value = "enhancer()")
    public void before(){
        System.out.println("开始表演之前需要--化妆");
    }

    @AfterReturning(value = "enhancer()")
    public void after(){
        System.out.println("表演完之后需要--卸载");
    }

}
